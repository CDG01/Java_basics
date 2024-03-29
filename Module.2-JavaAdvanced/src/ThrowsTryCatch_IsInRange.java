/* CONSEGNA:
Scrivere una funzione che controlli se un numero int è in un determinato range.
Se lo è ritorna true ; se non lo è, lancia un'eccezione.
 */

public class ThrowsTryCatch_IsInRange {
    public static void main(String[] args) {
        int number = 6;
        int lowerBound = 10;
        int upperBound = 20;

        try { // stampo true se il numero è nel range
            System.out.println(isInRange(number, lowerBound, upperBound));
        } catch (Exception e) { //stampo il messaggio di errore se il numero è fuori range e quindi isInRange ha lanciato un'eccezione
            System.out.println(e.getMessage());
        }
    }

    public static boolean isInRange(int number, int lowerBound, int upperBound) throws Exception {
        if (number >= lowerBound && number <= upperBound) {
            return true;
        } else {
            throw new Exception("Il numero non è nel range specificato.");
        }
    }
}

/*
La dichiarazione throws Exception in una firma di metodo indica che quel metodo potrebbe lanciare
un'eccezione di tipo Exception durante la sua esecuzione e che chiunque chiami quel metodo
dovrebbe gestire tale eccezione o propagarla a sua volta.

Nel caso della funzione isInRange nell'esempio fornito, viene utilizzata per indicare che
il metodo può lanciare un'eccezione di tipo Exception nel caso in cui il numero fornito non
sia nel range specificato. Questo avviene quando la condizione
if (number >= lowerBound && number <= upperBound) nel metodo isInRange non è soddisfatta.

Se un metodo lancia un'eccezione, può farlo in due modi: gestendo l'eccezione all'interno
del metodo stesso o propagandola usando throws nella firma del metodo, delegando il compito
di gestione dell'eccezione al chiamante del metodo.

Quindi, nel caso della funzione isInRange, chiunque la chiami deve essere consapevole del fatto
che può generare un'eccezione e deve prendere le misure necessarie per gestirla,
ad esempio utilizzando un blocco try-catch per catturare l'eccezione o propagandola ulteriormente.
 */