import java.util.Scanner;

/* CONSEGNA
Programma che stampa la tabellina del numero inserito in input dall'utente

Rispetto la versione1, la versione2 è peggio perché la ricorsione non viene usata per svolgere il ruolo di ciclo while.
Non etra nel loop infinito perché ogni iterazione della ricorsione lo scanner viere ri-dichairato
 */
public class TimesTable_InputMethods_v2 {

    public static void main(String args[]) {
        Scanner inputNum = new Scanner(System.in);


        boolean error;

            error = false;
            try {
                System.out.println("Inserisci il numero intero per cui vuoi calcolare la tabellina:");
                int number = inputNum.nextInt();
                TimesTableOfNum(number);
            } catch (Exception e) {// e è il nome della varabile a cui è assegnato come valore il tipo di errore avvenuto
                error = true;
                System.out.println("L'input deve essere un numero intero, ritenta:");
                main(args); // non ho mai dichiarato arg
            }
    }

    public static void TimesTableOfNum(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
