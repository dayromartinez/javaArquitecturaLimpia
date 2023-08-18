package co.com.bancolombia.mongo.suma;

import co.com.bancolombia.model.suma.Suma;
import co.com.bancolombia.model.suma.repository.SumaRepository;
import co.com.bancolombia.mongo.helper.AdapterOperations;
import co.com.bancolombia.mongo.suma.mapper.SumaMapper;
import lombok.extern.java.Log;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Repository
@Log
public class SumaRepositoryAdapter extends AdapterOperations<Suma, SumaData, String, SumaDataRepository> implements SumaRepository {

    @Autowired
    public SumaRepositoryAdapter(SumaDataRepository repository, ObjectMapper mapper, Function<SumaData, Suma> toEntityFn) {
        super(repository, mapper, d -> mapper.mapBuilder(d, Suma.SumaBuilder.class).build());
    }

    protected Suma toEntity(SumaData data) {
        return SumaMapper.toEntity(data);
    }

    protected SumaData toData(Suma suma) {
        return SumaMapper.toData(suma);
    }

    @Override
    public Mono<Suma> guardarSuma(Suma suma) {
        return Mono.fromSupplier(() -> repository.save(SumaMapper.toData(suma)))
                .map(this::toEntity)
                .onErrorResume(throwable -> {
                    log.severe(throwable.getMessage());
                    return Mono.empty();
                });
    }

}
