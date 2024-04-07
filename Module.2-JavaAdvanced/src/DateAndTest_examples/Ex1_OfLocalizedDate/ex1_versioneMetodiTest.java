package DateAndTest_examples.Ex1_OfLocalizedDate;


import org.junit.Test;

import java.time.DateTimeException;
import java.time.OffsetDateTime;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class ex1_versioneMetodiTest {

    @Test
    public void fromOffsetDateTimoToStringSHORTTest(){
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String actual = ex1_versioneMetodi.fromOffsetDateTimoToStringSHORT(offsetDateTime);
        String expected = "01/03/02";
        assertEquals(actual,expected);
    }

    @Test
    public void fromStringToOffsetDateTimeTest(){
        OffsetDateTime actual = ex1_versioneMetodi.fromStringToOffsetDateTime("2002-03-01T13:00:00Z");
        OffsetDateTime expected = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        assertEquals(actual,expected);
    }

    @Test
    public void fromStringToOffsetDateTimeTest_InvalidDate(){
        assertThrows(DateTimeException.class,()-> ex1_versioneMetodi.fromStringToOffsetDateTime("Invalid String"));
    }

    /*
    La .class è una notazione utilizzata in Java per ottenere l'oggetto Class associato a un tipo specifico, come una
    classe o un'interfaccia. Nell'esempio che hai fornito, .class viene utilizzato per ottenere l'oggetto Class
    associato alla classe DateTimeException. Questo è necessario perché il metodo assertThrows() richiede un oggetto
    Class come primo argomento per specificare il tipo di eccezione che ci si aspetta di essere lanciato durante
    l'esecuzione del codice all'interno della lambda expression.

    Le lambda expressions sono una caratteristica introdotta in Java 8 che consente di trattare le funzioni come un'entità
    di primo livello. Possono essere utilizzate per creare un'istanza di un'interfaccia funzionale senza la necessità di
    definire una classe anonima. Le lambda expressions sono spesso utilizzate in contesti in cui è richiesta un'interfaccia
    funzionale, come nel caso del metodo assertThrows(), che accetta un'interfaccia funzionale come argomento.
     */

    /*
    in Java non è possibile creare un'istanza diretta di un'interfaccia, poiché le interfacce non possono contenere
    implementazioni di metodi. Tuttavia, le lambda expressions forniscono un modo per creare istanze di
    un'interfaccia funzionale senza dover dichiarare una classe separata che implementa l'interfaccia.
    (Chiara pensa che crei un'istanza di una classe anonima che implementa un'interfaccia funzionale)

    Nel caso di assertThrows, il secondo parametro è un'espressione lambda che fornisce un'implementazione
    del metodo astratto dell'interfaccia funzionale Executable, che ha un singolo metodo void execute().

    Ecco un esempio di come appare l'interfaccia Executable:

    @FunctionalInterface
    public interface Executable {
        void execute() throws Throwable;
    }

    Nel contesto di assertThrows, l'interfaccia funzionale Executable è utilizzata per rappresentare il codice
    che ci si aspetta di lanciare un'eccezione. Utilizzando una lambda expression, possiamo fornire un'implementazione
    concisa di execute() senza dover dichiarare una classe separata.

    Quindi, in breve, il secondo parametro di assertThrows è un'espressione lambda che crea un'istanza
    di un'interfaccia funzionale (in questo caso Executable) fornendo un'implementazione del suo metodo astratto.
    */
}