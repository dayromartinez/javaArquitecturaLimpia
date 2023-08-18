package co.com.bancolombia.api.suma;

import co.com.bancolombia.api.suma.dto.SumaDTO;
import co.com.bancolombia.api.suma.dto.SumarRespuestaDTO;
import co.com.bancolombia.model.suma.Suma;

public class SumaConverter {

    public SumaConverter() {
    }

    public static Suma construirSuma(SumaDTO sumaDTO) {
        return Suma.builder()
                .id(sumaDTO.getId())
                .numeroUno(sumaDTO.getNumeroUno())
                .numeroDos(sumaDTO.getNumeroDos())
                .resultado(sumaDTO.getResultado())
                .fecha(sumaDTO.getFecha())
                .build();
    }

    public static SumarRespuestaDTO construirRespuesta(Suma suma) {
        SumarRespuestaDTO sumarRespuestaDTO = new SumarRespuestaDTO();

        sumarRespuestaDTO.setNumeroUno(suma.getNumeroUno());
        sumarRespuestaDTO.setNumeroDos(suma.getNumeroDos());
        sumarRespuestaDTO.setResultado(sumarRespuestaDTO.getResultado());

        return sumarRespuestaDTO;
    }
}
