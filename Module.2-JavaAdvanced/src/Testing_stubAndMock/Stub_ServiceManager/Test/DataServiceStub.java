package Testing_stubAndMock.Stub_ServiceManager.Test;

import Testing_stubAndMock.Stub_ServiceManager.src.DataService;

// lo stub serve per semplificare il processo di testing semplificando la dipendenza che ho dalle classi esterne.
// Lo faccio definendo personalmente una struttura dati su cui la classe di testing deve lavorare
// struttura meno complessa del database vero che implementerebbe l'interfaccia DataService, ma più complicata di un semplice array perché è una classe
public class DataServiceStub implements DataService {
    @Override
    public int[] retrieveData() {
        // Fornisce dati di risposta predefiniti per il test
        return new int[]{1, 2, 3, 4, 5};
    }
}