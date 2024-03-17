package Polimorfismo_Saluti;

public class Avvocato extends Persona{

    Avvocato(String nome) {
        super(nome);
    }

    @Override
    public void siPresenta() {
        System.out.println("Buongiorno, sono un avvocato serio.");
    }


}
