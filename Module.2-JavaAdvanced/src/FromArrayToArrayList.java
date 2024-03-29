import java.util.ArrayList;
import java.util.Arrays;

/*
per istanziare la lista crei l'array e poi passi da Arrays.asList():
non è il massimo dell'ottimizzazione perché usi sempre due strutture invece che una,
con doppio spazio di memoria occupato. Inoltre, in caso di strutture con molti dati,
questo approccio rallenta anche l'esecuzione del programma, perchè stai facendo uno step in più
(non necessario). Si crea un'istanza vuota della lista senza passare alcun array e successivamente
si aggiungono gli elementi.

 */

public class FromArrayToArrayList {
    public static void main(String[] args) {

        /// MODO 1:
        // n oggetti da inserire nell'ArrayList (n arbitrario), messi in un Array
        String[] array = {"A", "B"};
        // Creazione di un ArrayList da un array
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

        /// MODO 2:
        // Creazione di un ArrayList da un array
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("A", "B"));
        // questa soluzione ha un tempo di esecuzione O(1).
        // Array.asList crea un "ponte tra l'array e la lista" e l'esecuzione è rapida perché è solo un'istruzione: è un wrapper/ponte attorno all'array che viene dato come input
        // con questo approccio non si clonano/copiano i dati, quindi lo fa in una istruzione
        // in questo caso il tutor non è convinto ci sia una vera e propira conversione a Lista
        // forse, in temrini di spazi di memoria non c'è la conversione a list

        /// MODO 3:
        // n oggetti da inserire nell'ArrayList (n arbitrario), messi in un Array
        String[] array3 = new String[] {"A", "B"};
        // Creazione di un ArrayList da un array
        ArrayList<String> arrayList3 = new ArrayList<>(Arrays.asList(array3));
    }
}
