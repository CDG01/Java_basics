package DateAndTest_examples.Ex2_OfPatternLocalizedZoned;

import org.junit.Test;

import java.time.DateTimeException;
import java.util.Locale;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class ex4_versioneMetodiTest {

    @Test
    public void formatMonthFromUnicodeTest_validString(){
        assertEquals("01/marzo/2023 14:00:00", ex2_versioneMetodi.localizedZonedDateFromUnicode("2023-03-01T13:00:00Z", Locale.ITALY, "Europe/Rome"));
    }

    @Test
    public void formatMonthFromUnicodeTest_invalidString(){
        assertThrows(DateTimeException.class,()-> ex2_versioneMetodi.localizedZonedDateFromUnicode("not a unicode date", Locale.ITALY, "Europe/Rome"));
    }
}

/*
Il secondo argomento di assertThrows è un'istanza di una classe anonima che implementa l'interfacci afunzionale Executable.
Quindi, il secondo argomento è un'espressione lambda che rappresenta un'istanza dell'interfaccia funzionale Executable,
che ha un singolo metodo astratto void execute() throws Throwable.
Quando si chiama assertThrows con un'espressione lambda, il metodo assertThrows esegue il codice nell'espressione lambda,
osserva se viene lanciata un'eccezione e se l'eccezione è dello stesso tipo specificato come primo argomento di assertThrows.
Se l'eccezione viene lanciata correttamente, il test viene superato, altrimenti il test fallisce.
 */