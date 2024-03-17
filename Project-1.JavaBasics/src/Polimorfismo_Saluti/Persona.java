package Polimorfismo_Saluti;

public abstract class Persona {
    private String nome;

    public Persona(String nome) {
        this.nome = nome;
    }

    public abstract void siPresenta();

    public String getNome() {
        return nome;
    }

    public static void presentazione (Persona[] persone) {
        for (Persona persona : persone) {
            persona.siPresenta();
        }
    }
}
