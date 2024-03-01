package Encapsulation_Supermarket;

import java.util.Arrays;

public class Items {
    private String name;
    private double price;
    private double IVA;

    public Items(String name, double price, double IVA) {
        this.name = name;
        this.price = price;
        this.IVA = IVA;
    }

    /*
            GETTER e SETTER:
            I metodi getter permettono di vedere nome e prezzo degli articoli
            Non implemento i setter perché non voglio che prize e name siano modificabili una volta assegnati
             */
    public double getPrice(boolean withIVA) {
        if (withIVA) {
            return this.price + this.price*this.IVA;
        } else {
            return this.price;
        }
    }

    public String getName() {
        return this.name;
    }

    /*
    Sovrascrivo il metodo toSTring in modo che stampi in cosole i valori delle propietà delle istanze della classe Carts
    anziché il loro indirizzo in memoria
     */

    @Override
    public String toString() {
        return "Items{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", IVA='" + IVA + '\'' +
                '}';
    }
}
