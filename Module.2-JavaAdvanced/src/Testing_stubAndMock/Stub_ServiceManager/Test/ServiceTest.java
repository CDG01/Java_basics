package Testing_stubAndMock.Stub_ServiceManager.Test;

import Testing_stubAndMock.Stub_ServiceManager.src.DataService;

import Testing_stubAndMock.Stub_ServiceManager.src.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    // testo la classe service su un set di dati gestito da uno stub esterno , che in questo caso è una classe
    @Test
    public void testCalculateSum() {

        // Creazione dello stub per Data.DataService
        DataService stubDataService = new DataServiceStub();

        // Creazione dell'oggetto MyService con lo stub Data.DataService
        Service myService = new Service(stubDataService);

        // Chiamata al metodo da testare
        int result = myService.calculateSum();

        // Verifica del risultato del test
        assertEquals(15, result); // Si aspetta che la somma sia 15
    }
}