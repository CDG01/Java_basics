package DateAndTest_examples.DateAndTest3_OfPatternOrGetter;

import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ex3_versionGetter {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.print("anno: ");
        System.out.println(data.getYear());
        System.out.print("mese: ");
        System.out.println(data.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.print("mese: ");
        System.out.println(data.getMonthValue());
        System.out.print("giorno: ");
        System.out.println(data.getDayOfMonth());
        System.out.print("giorno della settimana: ");
        System.out.println(data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault())); // getDayOfWeek() ritorna un istanza della classe DayOfTheWeek; getDisplayName() ritona una stringa
    }
}

/*
Il giorno della settimana e il mese vengono formattati utilizzando TextStyle.FULL
per ottenere il nome completo e Locale.getDefault() per utilizzare la lingua e le convenzioni locali
predefinite del sistema in cui viene eseguito il codice.
 */
