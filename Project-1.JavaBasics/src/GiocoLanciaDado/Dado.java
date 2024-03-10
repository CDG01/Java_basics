package GiocoLanciaDado;

import java.util.Random;

public class Dado {

    private Random random = new Random(); // la classe Random ha come valore di default null, ma all'istanza random ho assegnato uno spazio di memoria definito dalla classe stesse

    // Costruttore inultile: (c'è già di default)
    // public Dado (){}

    public int lancia(){
        return random.nextInt(6)+1;
    }
}