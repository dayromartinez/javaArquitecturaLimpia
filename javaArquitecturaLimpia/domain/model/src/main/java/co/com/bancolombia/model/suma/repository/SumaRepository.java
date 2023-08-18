package co.com.bancolombia.model.suma.repository;

import co.com.bancolombia.model.suma.Suma;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SumaRepository {
    Mono<Suma> guardarSuma(Suma suma);
}
