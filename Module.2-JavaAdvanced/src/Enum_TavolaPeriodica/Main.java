package Enum_TavolaPeriodica;

/*
gli enum possono avere degli attrbuti che possono essere assegnati attraverso il costruttore
Gli elementi della tavola periodica sono predefiniti, e ciascuno ha dei valori associati alle propietà
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(ElementoTavolaPeriodica.ELIO.getSimbolo());

        // ciclo per stampare i possibili valori dell'enum
        // il metodo values() riorna una array dei valori di enum
        for (ElementoTavolaPeriodica elementoTavolaPeriodica : ElementoTavolaPeriodica.values()){
            System.out.println("elemento: " + elementoTavolaPeriodica + ", simbolo: " + elementoTavolaPeriodica.getSimbolo() + ", massa: " + elementoTavolaPeriodica.getMassaAtomica() );

        }
    }
}
