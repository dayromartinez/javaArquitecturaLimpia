package co.com.bancolombia.usecase.crearSuma;

import co.com.bancolombia.model.suma.Suma;
import co.com.bancolombia.model.suma.repository.SumaRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CrearSumaUseCase {

    private final SumaRepository sumaRepository;

    public Mono<Suma> registrarSuma(Suma suma) {
        return sumaRepository.guardarSuma(suma);
    }
}
