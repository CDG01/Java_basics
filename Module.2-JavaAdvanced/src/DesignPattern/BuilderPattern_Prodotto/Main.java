package DesignPattern.BuilderPattern_Prodotto;

/*
il builder è un pattern di programmazione usato quando bisogna costruire oggetti complessi passo passo

separa la costruzione dell'oggetto dalla sua rappresentazione

quando vedremo
 */
public class Main {
    public static void main(String[] args) {
        // modo1: creare un prodotto attraverso il Builder è un codice più leggibile
        Prodotto prodotto1 = new ProdottoBuilder()
                .setNome("Caffè")
                .setDescrizione("caffè in grani")
                .setPrezzo(5.2)
                .build();

        // posso settare meno parametri senza dover creare altri costruttori di Prodotto
        Prodotto prodotto2 = new ProdottoBuilder()
                .setNome("Acqua")
                .setPrezzo(5.2)
                .build();

        // modo2: creare un prodotto senza il Builder
        Prodotto prodotto3 = new Prodotto("Pasta", "Adatta ai vegani", 2.7);
    }
}
