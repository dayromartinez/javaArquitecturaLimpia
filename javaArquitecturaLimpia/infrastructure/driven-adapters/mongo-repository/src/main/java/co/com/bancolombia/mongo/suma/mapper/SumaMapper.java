package co.com.bancolombia.mongo.suma.mapper;

import co.com.bancolombia.model.suma.Suma;
import co.com.bancolombia.mongo.suma.SumaData;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class SumaMapper {

    public static Suma toEntity(SumaData sumaData) {
        return Suma.builder()
                .id(sumaData.getId())
                .numeroUno(sumaData.getNumeroUno())
                .numeroDos(sumaData.getNumeroDos())
                .resultado(sumaData.getResultado())
                .fecha(sumaData.getFecha())
                .build();
    }

    public static SumaData toData(Suma suma) {

        SumaData sumaData = new SumaData();
        sumaData.setId(suma.getId());
        sumaData.setNumeroUno(suma.getNumeroUno());
        sumaData.setNumeroDos(suma.getNumeroDos());
        sumaData.setResultado(suma.getNumeroDos());
        sumaData.setFecha(sumaData.getFecha());

        return sumaData;
    }
}
