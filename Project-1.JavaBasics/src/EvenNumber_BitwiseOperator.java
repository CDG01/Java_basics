/* CONSEGNA:
Scrivi un programma che contiene un metodo che prenda un numero in ingresso
e capisca se un numero è pari o dispari utilizzando solo gli operatori bitwise.
 */

public class EvenNumber_BitwiseOperator {
    public static void main(String[] args) {
        int number = 3;
        System.out.println("Is " + number + " even? " + isItEven(number));
    }

    public static boolean isItEven(int num) {
        return (num & 1) == 0;
    }

    /*
    Nel metodo isItEven, ho utilizzato l'operatore bitwise & per verificare
    se il bit meno significativo (LSB) di num è 0, il che indica che il numero è pari.
    Se il risultato dell'operazione num & 1 è uguale a 0, il metodo restituisce true,
    altrimenti restituisce false.
     */
}
