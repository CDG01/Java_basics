package Encapsulation_Supermarket;

import java.util.Arrays;



public class Carts {
    // ATTRIBUTI
    private Items[] items; // un attributo della classe Carts è l'arrey items riempita di stanze della classe Items


    // METODI

    // costruttore
    public Carts(Items[] items){
        this.items = items;
    }

    /*
    GETTER e SETTER:
    I metodi getter permettono di vedere l'arrey items[] degli articoli nel carrello cart e totalPrize del carello
    Non implemento i setter perché non voglio che prize e name siano modificabili una volta assegnati
     */
    public double getTotalPrice(boolean withIVA) {
        double totalPrice = 0.0;

        // calcolo prezzo totale in base al contenuto del carrello e alla richiesta di prezzo con o senza iva
        for (Items item : items) {
            totalPrice += item.getPrice(withIVA);
        }

        return totalPrice;
    }

    public Items[] getItems() {
        return items;
    }




    /*
    Sovrascrivo il metodo toSTring in modo che stampi in cosole i valori delle propietà delle istanze della classe Carts
    anziché il loro indirizzo in memoria
     */
    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public void printReceipt() {
        System.out.println("Scontrino:");
        System.out.println("Il carrello è: " + this);
        System.out.println("Numero di articoli: " + this.getItems().length);
        System.out.println("Prezzo IVA esclusa: " + this.getTotalPrice(false));
        System.out.println("Prezzo IVA inclusa: " + this.getTotalPrice(true));
    }
}
