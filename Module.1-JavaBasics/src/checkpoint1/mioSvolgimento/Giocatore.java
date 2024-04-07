package checkpoint1.mioSvolgimento;

public class Giocatore {
    String nome;
    Razza razza;
    int posizioneX;
    int posizioneY;
    int salute;

    int puntiAttacco;
    int puntiDifesa;

    String[] inventario;

    public Giocatore(String nome, Razza razza, int posizioneX, int posizioneY) {
        this.nome = nome;
        this.razza = razza;
        this.posizioneX = posizioneX;
        this.posizioneY = posizioneY;
    }

    public Giocatore(String nome, Razza razza, int posizioneX, int posizioneY, int salute, int puntiAttacco, int puntiDifesa, String[] inventario) {
        this.nome = nome;
        this.razza = razza;
        this.posizioneX = posizioneX;
        this.posizioneY = posizioneY;
        this.salute = salute;
        this.puntiAttacco = puntiAttacco;
        this.puntiDifesa = puntiDifesa;
        this.inventario = inventario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Razza getRazza() {
        return razza;
    }

    public void setRazza(Razza razza) {
        this.razza = razza;
    }

    public int getPosizioneX() {
        return posizioneX;
    }

    public void setPosizioneX(int posizioneX) {
        this.posizioneX = posizioneX;
    }

    public int getPosizioneY() {
        return posizioneY;
    }

    public void setPosizioneY(int posizioneY) {
        this.posizioneY = posizioneY;
    }

    public int getSalute() {
        return salute;
    }

    public void setSalute(int salute) {
        this.salute = salute;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public void setPuntiAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }

    public int getPuntiDifesa() {
        return puntiDifesa;
    }

    public void setPuntiDifesa(int puntiDifesa) {
        this.puntiDifesa = puntiDifesa;
    }

    public String[] getInventario() {
        return inventario;
    }

    public void setInventario(String[] inventario) {
        this.inventario = inventario;
    }

    public void muovi(int passoX, int passoY){
        posizioneX += passoX;
        posizioneY += passoY;
    }

    public void colpisci(Giocatore giocatoreDaColpire) {
        giocatoreDaColpire.salute = giocatoreDaColpire.salute - puntiAttacco + puntiDifesa;
    }


}
