package DateAndTest_examples.Ex1_OfLocalizedDate;

import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static junit.framework.TestCase.assertEquals;


public class ex1Test {

    @Test
    public void testFormatFull() {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = "venerdì 1 marzo 2002";
        String actual = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        assertEquals(expected, actual);
    }

    @Test
    public void testFormatMedium() {
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String expected = "1 mar 2002";
        String actual = offsetDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        assertEquals(expected, actual);
    }
}
