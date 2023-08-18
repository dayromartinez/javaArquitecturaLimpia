package co.com.bancolombia.model.suma;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Builder(toBuilder = true)
@Getter
public class Suma {

    private String id;
    private double numeroUno;
    private double numeroDos;
    private double resultado;
    private String fecha;

}

