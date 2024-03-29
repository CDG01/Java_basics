package GiocoLanciaDado;

public class Giocatore {

    private String name;
    private int score; // ha valore di default del tipo int, che è 0

    public Giocatore (String name){
        this.name = name;
    }
    public int getScore() {
        return score;
    }

    public void aggScore (int points){
        this.score = this.score + points;
    }

    public String getName() {
        return name;
    }
}