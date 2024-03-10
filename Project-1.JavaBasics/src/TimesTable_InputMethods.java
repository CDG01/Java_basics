import java.util.Scanner;

/* CONSEGNA
Programma che stampa la tabellina del numero inserito in input dall'utente
 */


public class TimesTable_InputMethods {
    public static void main(String args[]) {
        Scanner inputNum = new Scanner(System.in).useDelimiter("\n");

        boolean error;
        do {
            error = false;
            try {
                System.out.println("Inserisci il numero intero per cui vuoi calcolare la tabellina:");
                int number = inputNum.nextInt();
                TimesTableOfNum(number);
            } catch (Exception e) {// e è il nome della varabile a cui è assegnato come valore il tipo di errore avvenuto
                error = true;
                System.out.println("L'input deve essere un numero intero, ritenta:");

                inputNum.nextLine(); // Per evitare un loop infinito, consumiamo l'input errato leggendo il buffer fino al new line ma non salvando la stringa in nessuna variabile
                // System.out.println("L'input errato è: "+ inputNum.next());  // alternativamente, va bene questa riga di codice per consumare il buffer e quindi fermare il loop

            }
        } while (error);
    }

    public static void TimesTableOfNum(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

/* SPIEGAZIONE inputNum.nextLine():
Quando si verifica un'eccezione durante l'elaborazione dell'input dell'utente con inputNum.nextInt(),
l'input non viene completamente consumato. Questo significa che il valore non valido rimane nel buffer
dell'input, pronto per essere letto dalla prossima chiamata a un metodo di input come nextInt().

Senza una gestione adeguata, se l'utente continua a inserire un input non valido,
il programma rimarrà intrappolato in un loop infinito, poiché ogni volta che si tenta di leggere l'input,
l'eccezione continuerà a essere lanciata.

La chiamata inputNum.nextLine() nel blocco catch serve a risolvere questo problema. Questo metodo nextLine()
legge l'input non valido fino al prossimo carattere di nuova riga, consumando così l'input non valido rimasto
nel buffer e consentendo al programma di avanzare senza interruzioni.

In breve, inputNum.nextLine() è una pratica comune per "pulire" il buffer di input nel caso in cui si
verifichi un'eccezione durante la lettura dell'input dell'utente, garantendo che il programma possa
continuare a funzionare correttamente senza rimanere intrappolato in un loop infinito a causa dell'input
non valido.
 */
