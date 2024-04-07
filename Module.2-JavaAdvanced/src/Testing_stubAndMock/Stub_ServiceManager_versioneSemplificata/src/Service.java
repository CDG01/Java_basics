package Testing_stubAndMock.Stub_ServiceManager_versioneSemplificata.src;

/*
  Se non voglio implementare la classe di stub, ma voglio fare un testing del metodo in cui passo una strutta dati predefinita, sono costretta a modificare tutta la struttura del mio codice
  Non creo la classe stub, nè l'interfaccia
 */

public class Service {
    public Service() {
    }

    public int calculateSum(int[] data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum;
    }
}