package co.com.bancolombia.mongo.suma;

import co.com.bancolombia.model.suma.Suma;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

import java.util.Date;

public interface SumaDataRepository extends ReactiveCrudRepository<SumaData, String>, ReactiveQueryByExampleExecutor<SumaData> {

    Flux<Suma> findAllByFechaBetween(String fechaInicio, String fechaFin);
}
