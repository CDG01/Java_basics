package Exceptions_ProdottiSupermercatoi.models;

import java.util.HashMap;

public class CarrelloSpesa {
    public static HashMap<String, Integer> carrello = new HashMap<String, Integer>();


    public static void aggiungiProdottoAlCarrello(String ID, Integer quantitaDaAggiungereInCarrello) {

        try{
            DispensaSupermermecato.rimuoviProdottoDaDispensa(ID, quantitaDaAggiungereInCarrello);
            if (carrello.containsKey(ID)){
                Integer nuovaquantitaInCarrello = carrello.get(ID) + quantitaDaAggiungereInCarrello;
                carrello.put(ID, nuovaquantitaInCarrello);
            } else{
                carrello.put(ID, quantitaDaAggiungereInCarrello);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + ": nella dispensa del supermecato ci sono " + DispensaSupermermecato.dispensa.get(ID) + " prodotti di questo tipo, ma tu ne stai cercando di mettere nel carrello " + quantitaDaAggiungereInCarrello);
        }
    }

    public static void controllaSeScaduto(String ID){
        Prodotto prodotto = Prodotto.daIdRItornaProdotto(ID);

        //if (prodotto.dataDiScadenza.getTime() < System.currentTimeMillis()) {
        //    throw new ScadenzaProdottoException();
        //}
    }


}
