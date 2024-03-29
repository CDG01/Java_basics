package GiocoLanciaDado;

public class GiocoDado {

    private Giocatore[] giocatori; // arrey di istanze della classe Giocatore
    private Dado dado = new Dado(); // i giocatori usano un unico dado lanciandolo a turno

    public GiocoDado(Giocatore[] giocatori) {
        this.giocatori = giocatori;
    }

    public void avviaGioco(){
        for (int i = 0; i < 6; i++) {
            System.out.println("Giro di lanci numero " + (i + 1) + ":");
            for (Giocatore giocatore: giocatori){
                int lancio = dado.lancia();
                giocatore.aggScore(lancio);
                System.out.println("il giocatore: " + giocatore.getName() + " ha ottenuto: " + lancio + " e il suo punteggio attuale è: "  + giocatore.getScore());
            }
        }

        // METODO PER TROVARE IL VINCITORE CHE NON TIENE CONTO DI POSSIBILI PARI-MERITI:
            Giocatore winner = giocatori[0];
        for (int i = 1; i < giocatori.length; i++){
            if(giocatori[i].getScore() > winner.getScore()){
                winner = giocatori[i];
            }
        }
        System.out.println("Il vincitore è: " + winner.getName() + " con il punteggio: " + winner.getScore());
    }
}