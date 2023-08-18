package co.com.bancolombia.helper.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Builder(toBuilder = true)
@Getter
@Setter
@EqualsAndHashCode
public class SumaDto {

    private String id;
    private double numeroUno;
    private double numeroDos;
    private double resultado;
    private String fecha;
}
