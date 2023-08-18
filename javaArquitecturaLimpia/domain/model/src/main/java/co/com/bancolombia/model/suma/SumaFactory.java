package co.com.bancolombia.model.suma;

public class SumaFactory {

    public SumaFactory() {
    }

    public static Suma crearSuma(double numeroUno, double numeroDos, double resultado, String fecha) {
        return Suma.builder()
                .numeroUno(numeroUno)
                .numeroDos(numeroDos)
                .resultado(resultado)
                .fecha(fecha)
                .build();
    }
}
