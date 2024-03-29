package GiocoLanciaDado;

/*
Descrizione dell'esercizio:
Immagina di creare un gioco semplice in cui ci sono più giocatori che competono tra loro.
Ogni giocatore ha un nome, un punteggio e può lanciare un dado per ottenere un punteggio casuale da 1 a 6.
Requisiti:
Definire una classe Giocatore che ha i seguenti attributi:
Nome del giocatore.
Punteggio del giocatore.
Definire una classe Dado che ha un metodo lancia() che restituisce un numero casuale da 1 a 6.
Definire una classe Gioco che gestisce il gioco:
Creare un array di oggetti Giocatore.
Consentire ai giocatori di lanciare il dado e aggiornare il loro punteggio.
Stampare il punteggio di ogni giocatore dopo ogni lancio del dado.
Alla fine, stampare il nome del giocatore con il punteggio più alto.
Creare metodo che stampi la classifica finale.
 */

public class Main {
    public static void main(String[] args) {

        Giocatore[] giocatores = {new Giocatore("Marco"), new Giocatore("Francesco"), new Giocatore("Davide"), new Giocatore("Valentina"), new Giocatore("Giovanni")};
        GiocoDado gioco = new GiocoDado(giocatores);
        gioco.avviaGioco();
    }
}