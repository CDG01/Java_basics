package DateAndTest_examples.Ex2_OfPatternLocalizedZoned;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ex2 {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss").withLocale(Locale.ITALY).withZone(ZoneId.of("Europe/Rome"));

        String stringDateTimeFormatted = offsetDateTime.format(dateTimeFormatter);
        System.out.println("Risultato localizzato in Italia nella zona di Roma: " + stringDateTimeFormatted );
    }
}
// Locale: determina la lingua e le convensioni di formattazione della data e dell'ora (e.g. lingua del giorno della settimana e del mese)
// ZoneId: determina il fuso orario utilizzato per la formattazione della data (e.g. in questo esercizio, viene aggiunta un ora per visualizzare il fuso orario a Roma)