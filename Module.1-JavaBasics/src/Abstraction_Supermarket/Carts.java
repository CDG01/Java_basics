package Abstraction_Supermarket;

import java.util.Arrays;

public abstract class Carts {
    // ATTRIBUTI
    private Items[] items;

    // METODI

    // costruttore
    public Carts(Items[] items){
        this.items = items;
    }

    /*
    GETTER e SETTER:
    */
    public abstract double getTotalPrice() ;

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
        System.out.println("Prezzo: " + this.getTotalPrice());
    }
}
