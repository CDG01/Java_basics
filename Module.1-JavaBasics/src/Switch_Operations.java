import java.math.BigDecimal;
import java.math.RoundingMode;

/*
Le switch expression è quando definiamo una variabile mettendoci dentro uno switch
è diverso dai switch statement, che sono quando usiamo lo switch ma non lo mettiamo dopo l'operatore di assegnazione per definire una variabile
 */


public class Switch_Operations {
    public enum OperazioneAritmetica {
        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE,
        DIVISIONE,
        OPERAZIONEINVENTATA,
    }

    // nel caso dell'operatore -> non servono i break perché sono impliciti, esce da solo dallo switch quando è eseguito un case
    public static double calcoloOperazione_versione1(double num1, double num2, OperazioneAritmetica operazioneAritmetica){
        double result = 0;
        switch (operazioneAritmetica){
            case ADDIZIONE -> {
                result = num1+num2;
                break;
            }
            case SOTTRAZIONE -> {
                result = num1-num2;
                break;
            }
            case MOLTIPLICAZIONE -> {
                result = num1*num2;
                break;
            }
            case DIVISIONE -> {
                result = num1/num2;
                break;
            }
        }
        return result ;
    }

    // le graffe servono solo per non far interverire le variabili definite in case separate, perché crano scope distinti
    public static double calcoloOperazione_versione2(double num1, double num2, OperazioneAritmetica operazioneAritmetica){
        double result = switch (operazioneAritmetica){
            case ADDIZIONE -> {
                yield num1+num2;
            }
            case SOTTRAZIONE -> {
                yield num1-num2;
            }
            case MOLTIPLICAZIONE -> {
                yield num1*num2;
            }
            case DIVISIONE, OPERAZIONEINVENTATA -> {
                double risultatoDivisione = num1/num2; // posso usare yield dopo tante righe di codice dentro un case
                yield risultatoDivisione;
            }
        };
        return result;
    }

    public static double calcoloOperazione_versione3(double num1, double num2, OperazioneAritmetica operazioneAritmetica){
        double result = switch (operazioneAritmetica){
            case ADDIZIONE -> result = num1+num2;
            case SOTTRAZIONE -> result = num1-num2;
            case MOLTIPLICAZIONE -> result = num1*num2;
            case DIVISIONE, OPERAZIONEINVENTATA -> result = num1/num2;
        };
        return result ;
    }


    public static void main(String[] args) {
        double risultato = calcoloOperazione_versione1(3,5.2,OperazioneAritmetica.MOLTIPLICAZIONE);

        System.out.println("risultato: " + risultato);
    }
}
