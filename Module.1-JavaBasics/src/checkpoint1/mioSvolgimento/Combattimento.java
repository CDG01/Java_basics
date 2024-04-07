package checkpoint1.mioSvolgimento;

public class Combattimento {
    Giocatore[] giocatores;

    public Combattimento(Giocatore[] giocatores) {
        this.giocatores = giocatores;
    }

    public void attacco(Giocatore giocatoreAttaccante, Giocatore giocatoreAttaccato){
        giocatoreAttaccante.colpisci(giocatoreAttaccato);
    }
}
