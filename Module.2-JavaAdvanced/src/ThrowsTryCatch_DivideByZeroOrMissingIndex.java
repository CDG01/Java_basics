/* CONSEGNA:
Scrivere una funzione che accetti un array in input e provi a dividere un numero dell'array per 0
e gestisca sia l'eccezione della divisione che quella di indice non presente nell'array.
*/


public class ThrowsTryCatch_DivideByZeroOrMissingIndex {
    public static void main(String[] args) {
        int arrayIndex = 3;
        int[] numbers = {0,1, 2, 3, 4};
        int divisore = 0;
        ChooseYourDivision(divisore, numbers, arrayIndex);
    }

    public static void ChooseYourDivision(int divisore, int[] numbers, int arrayIndex) {
        try {
            System.out.println(numbers[arrayIndex] / divisore);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Hai generato un errore che non è divisione per 0 o indice fuori dall'array");
        } finally {
            System.out.println("Messaggio eseguito in ogni caso, mi chiedo quindi a che serva il blocco finally");
        }
    }
}

/*
In questo caso specifico, il blocco finally viene eseguito sempre, indipendentemente dal fatto che
venga sollevata un'eccezione o meno. Questo è utile per la pulizia delle risorse o per l'esecuzione
di azioni che devono essere eseguite in ogni caso, indipendentemente dall'eccezione.
 */
