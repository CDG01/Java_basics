package DateAndTest_examples.DateAndTest3_OfPatternOrGetter;

/* CONSEGNA:
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
 */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class ex3 {
    public static void main(String[] args) {
        // creo un oggetto chiamato data
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.print("anno: ");
        System.out.println(data.format(DateTimeFormatter.ofPattern("YYYY")));
        System.out.print("mese: ");
        System.out.println(data.format(DateTimeFormatter.ofPattern("MMMM")));
        System.out.print("giorno: ");
        System.out.println(data.format(DateTimeFormatter.ofPattern("dd")));
        System.out.print("giorno della settimana: ");
        System.out.println(data.format(DateTimeFormatter.ofPattern("EEEE")));
    }
}
