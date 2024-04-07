package Testing_stubAndMock.Stub_ServiceManager.src;

/*
un Service, in genre, fa da tramite con il database: rivece i dati dal database per modificarli
 */

public class Service {
    private DataService dataService; // dipendenza da un'interfaccia esterna (ma poteva essere anche un database esterno che recupera i dati)

    public Service(DataService dataService) {
        this.dataService = dataService;
    }

    // metodo che calcola la somma degli elementi in un array preso da setService, che però sono dati che arrivano dall'esterni, non interni a questa a questa classe.
    public int calculateSum() {
        int[] data = dataService.retrieveData();
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum;
    }
}