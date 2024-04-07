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

    // i metodi/attributi statici non supportano l'ereditarietà e il polimorfismo, il che può limitare la flessibilità del codice
    public static void metodoStaticoDiPersona () {
        System.out.println("Questo metodo non è ereditato dalle sottoclassi di Persona, e quindi non può essere Sovrascritto dalle sottoclassi dando luogo a polimorfismo");
    }

    public static void presentazione (Persona[] persone) {
        for (Persona persona : persone) {
            persona.siPresenta();
        }
    }
}
