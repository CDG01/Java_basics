package DesignPattern.BuilderPattern_Prodotto;

public class ProdottoBuilder {
    // stessi attributi di Prodotto
    String nome;
    String descrizione;
    Double prezzo;

    // setter che ritornano un ProdottoBuilder

    public ProdottoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProdottoBuilder setDescrizione(String descrizione) {
        this.descrizione = descrizione;
        return this;
    }

    public ProdottoBuilder setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
        return this;
    }

    public Prodotto build(){
        return new Prodotto(nome ,descrizione, prezzo);
    }
}
