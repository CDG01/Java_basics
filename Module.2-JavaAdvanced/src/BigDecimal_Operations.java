import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_Operations {
    public enum OperazioneAritmetica {
        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        MAX,
        MIN
    }

    public static BigDecimal calcoloOperazione(BigDecimal num1, BigDecimal num2, OperazioneAritmetica operazioneAritmetica){

        switch (operazioneAritmetica){
            case ADDIZIONE -> {
                return num1.add(num2);
            }
            case SOTTRAZIONE -> {
                return num1.subtract(num2);
            }
            case MOLTIPLICAZIONE -> {
                return num1.multiply(num2);
            }
            case DIVISIONE -> {
                return num1.divide(num2, 2, RoundingMode.HALF_UP); // scelgo di inserire anche le cifre decimali dopo la virgola (scale) e il modo di arrotondamento classicamente usato a scuola
            }
            case MAX -> {
                return num1.max(num2);
            }
            case MIN -> {
                return num1.min(num2);
            }
        }
        return BigDecimal.ZERO;
    }

    public static void main(String[] args) {
        BigDecimal risultato = calcoloOperazione(new BigDecimal("10.5"), new BigDecimal("2.5"), OperazioneAritmetica.MOLTIPLICAZIONE);

        System.out.println("risultato: " + risultato);
    }
}
