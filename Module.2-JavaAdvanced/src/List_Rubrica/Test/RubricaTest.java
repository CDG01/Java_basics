package List_Rubrica.Test;

import List_Rubrica.Contatto;
import List_Rubrica.Rubrica;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RubricaTest {

    @Test
    void aggiungiContatto() throws Exception {
        Rubrica rubrica = new Rubrica();
        Contatto contatto = new Contatto("Emmanuele", "Sartorio", "33333333", "+39");
        rubrica.aggiungiContatto(contatto);
        assertEquals(rubrica.size(), 1);

    }
}