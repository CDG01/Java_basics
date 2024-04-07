package Testing_stubAndMock.Stub_ServiceManager_versioneSemplificata.Test;

import Testing_stubAndMock.Stub_ServiceManager_versioneSemplificata.src.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    @Test
    public void testCalculateSum() {

        Service myService = new Service();

        // Chiamata al metodo da testare
        int result = myService.calculateSum(new int[]{1, 2, 3, 4, 5});

        // Verifica del risultato del test
        assertEquals(15, result); // Si aspetta che la somma sia 15
    }
}