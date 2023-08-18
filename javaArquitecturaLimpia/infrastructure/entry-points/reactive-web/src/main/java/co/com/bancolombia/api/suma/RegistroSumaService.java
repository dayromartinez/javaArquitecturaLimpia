package co.com.bancolombia.api.suma;

import co.com.bancolombia.api.suma.dto.SumaDTO;
import co.com.bancolombia.usecase.crearSuma.CrearSumaUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/crearSuma")
@RequiredArgsConstructor
public class RegistroSumaService {

    private final CrearSumaUseCase crearSumaUseCase;

    private static final String SOLICITUD_ACTUALIZADA_CON_EXITO = "¡Solicitud creada con éxito!";

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> registrarSuma(@RequestBody SumaDTO sumaDTO) {
        return crearSumaUseCase.registrarSuma(SumaConverter.construirSuma(sumaDTO))
                .map(suma -> String.format("Suma procesada y almacenada exitosamente. El resultado de esta es: %f", suma.getResultado()));
    }

}
