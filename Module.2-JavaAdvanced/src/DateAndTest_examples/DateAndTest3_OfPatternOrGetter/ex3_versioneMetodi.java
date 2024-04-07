package DateAndTest_examples.DateAndTest3_OfPatternOrGetter;

/* CONSEGNA:
Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z -> // chiamo l'oggetto offsetDateTime anziché data perché è più autodescrittivo
ottieni l'anno
ottieni il mese
ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
Crea dei test per questo esercizio
 */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class ex3_versioneMetodi {
    public static void main(String[] args) {

        System.out.println(" anno: " + formatYearFromUnicode("2023-03-01T13:00:00Z") +
                "\n mese: " + formatMonthFromUnicode("2023-03-01T13:00:00Z") +
                "\n giorno: " + formatDayFromUnicode("2023-03-01T13:00:00Z") +
                "\n giorno della settimana: " + formatDayNameFromUnicode("2023-03-01T13:00:00Z")
        );
    }

    static String formatYearFromUnicode(String unicodeString) {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(unicodeString);
        return offsetDateTime.format(DateTimeFormatter.ofPattern("yyyy"));
    }

    static String formatMonthFromUnicode(String unicodeString) {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(unicodeString);
        return offsetDateTime.format(DateTimeFormatter.ofPattern("MMMM"));
    }

    static String formatDayFromUnicode(String unicodeString) {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(unicodeString);
        return offsetDateTime.format(DateTimeFormatter.ofPattern("dd"));
    }

    static String formatDayNameFromUnicode(String unicodeString) {

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(unicodeString);
        return offsetDateTime.format(DateTimeFormatter.ofPattern("EEEE"));
    }
}
