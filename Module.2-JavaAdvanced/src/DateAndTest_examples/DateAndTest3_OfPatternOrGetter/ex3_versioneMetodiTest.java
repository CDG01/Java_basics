package DateAndTest_examples.DateAndTest3_OfPatternOrGetter;

import org.junit.Test;

import java.time.DateTimeException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class ex3_versioneMetodiTest {

    @Test
    public void formatMonthFromUnicodeTest_ValidString(){
        assertEquals("marzo", ex3_versioneMetodi.formatMonthFromUnicode("2023-03-01T13:00:00Z"));
    }

    @Test
    public void formatMonthFromUnicodeTest_invalidString(){
        assertThrows(DateTimeException.class,()-> ex3_versioneMetodi.formatMonthFromUnicode("not a unicode date"));
    }
}