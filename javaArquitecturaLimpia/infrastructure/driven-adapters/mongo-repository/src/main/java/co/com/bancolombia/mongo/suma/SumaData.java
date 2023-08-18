package co.com.bancolombia.mongo.suma;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class SumaData {

    @Id
    private String id;
    private double numeroUno;
    private double numeroDos;
    private double resultado;
    private String fecha;

}
