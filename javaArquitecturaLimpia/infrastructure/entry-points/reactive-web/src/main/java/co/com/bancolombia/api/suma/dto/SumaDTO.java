package co.com.bancolombia.api.suma.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Data
public class SumaDTO {

    private String id;
    @NotNull
    private double numeroUno;
    @NotNull
    private double numeroDos;
    private double resultado;
    private String fecha;
}
