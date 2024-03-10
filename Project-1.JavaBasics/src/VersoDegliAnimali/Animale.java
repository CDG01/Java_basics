package VersoDegliAnimali;

public class Animale {
    String nome;
    String verso;

    public Animale(String nome, String verso) {
        this.nome = nome;
        this.verso = verso;
    }

    public void faIlVerso() {
        System.out.println("Il " + this.nome + " " + this.verso);
    }
}
