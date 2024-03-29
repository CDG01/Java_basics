package Exceptions_ProdottiSupermercatoi.models;

import java.util.HashMap;

public class DispensaSupermermecato {

    public static HashMap<String, Integer> dispensa = new HashMap<String, Integer>();

    public static void rimuoviProdottoDaDispensa(String ID, Integer quantitaDaRimuovereDaSupermercato) throws Exception {
        if (dispensa.get(ID)<quantitaDaRimuovereDaSupermercato){
            throw new Exception("Non ci sono così tanti prodotti di questo tipo in questo supermercato");
        } else{
            dispensa.put(ID, dispensa.get(ID) - quantitaDaRimuovereDaSupermercato);
        }
    }

}
