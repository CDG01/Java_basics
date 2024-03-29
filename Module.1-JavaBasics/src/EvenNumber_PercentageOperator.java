/* CONSEGNA:
Scrivi un programma che contiene un metodo che prenda un numero in ingresso
e capisca se un numero è pari o dispari utilizzando solo gli operatori logici.
 */

public class EvenNumber_PercentageOperator {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("Is " + number + " even? " + isItEven(number));
    }

    public static boolean isItEven(int num) {
        return (num % 2) == 0;
    }

    /*
    L'operatore % restituisce il resto della divisione tra num e 2.
    Se il resto è 0, allora il numero è pari, altrimenti è dispari.
     */
}
