package DateAndTest_examples.Ex2_OfPatternLocalizedZoned;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


    public class ex2_versioneMetodi {
        public static void main(String[] args) {
            System.out.println("Risultato localizzato in Italia nella zona di Roma: " + localizedZonedDateFromUnicode("2023-03-01T13:00:00Z", Locale.ITALY, "Europe/Rome"));
        }

        static String localizedZonedDateFromUnicode(String unicodeString, Locale locale, String zoneIdString) {
            OffsetDateTime offsetDateTime = OffsetDateTime.parse(unicodeString);

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss").withLocale(locale).withZone(ZoneId.of(zoneIdString));

            String stringDateTimeFormatted = offsetDateTime.format(dateTimeFormatter);

            return stringDateTimeFormatted;
        }
    }


