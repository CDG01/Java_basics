package Exceptions_ProdottiSupermercatoi.models;

import java.util.HashMap;
import java.util.UUID;

public class Prodotto {
    String nome;
    double prezzo;
    String ID = UUID.randomUUID().toString();

    static HashMap<String, Prodotto> prodotti = new HashMap<>();


    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
        prodotti.put(ID, this);
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }


    public void setPrezzo(double prezzo) {
        if(prezzo<0){
            throw new IllegalArgumentException("Il prezzo non può essere negativo");
        }
        this.prezzo = prezzo;
    }

    public static Prodotto daIdRItornaProdotto(String ID){
        return prodotti.get(ID);
    }



}