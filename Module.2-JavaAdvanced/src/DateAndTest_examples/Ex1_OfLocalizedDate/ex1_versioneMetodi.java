package DateAndTest_examples.Ex1_OfLocalizedDate;

/* CONSEGNA:
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
 */

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ex1_versioneMetodi {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = fromStringToOffsetDateTime("2002-03-01T13:00:00Z");

        // Formattazione solo della data, senza ora e fuso orario perché non è richiesto nella consegna
        String dataStringFULL = fromOffsetDateTimoToStringFULL(offsetDateTime);

        String dataStringMEDIUM = fromOffsetDateTimoToStringMEDIUM(offsetDateTime);

        String dataStringSHORT = fromOffsetDateTimoToStringSHORT(offsetDateTime);

        System.out.println(dataStringFULL);
        System.out.println(dataStringMEDIUM);
        System.out.println(dataStringSHORT);
    }

     static String fromOffsetDateTimoToStringSHORT(OffsetDateTime offsetDateTime) {
        return offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }

     static String fromOffsetDateTimoToStringMEDIUM(OffsetDateTime offsetDateTime) {
        return offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

     static String fromOffsetDateTimoToStringFULL(OffsetDateTime offsetDateTime) {
        return offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }

     static OffsetDateTime fromStringToOffsetDateTime(String dateString) {
        return OffsetDateTime.parse(dateString);
    }
}
