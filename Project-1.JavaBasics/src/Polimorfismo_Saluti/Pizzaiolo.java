package Polimorfismo_Saluti;

public class Pizzaiolo extends Persona{
    private int numeroDiPizzeAlGiorno;

    public Pizzaiolo(String nome, int numeroDiPizzeAlGiorno) {
        super(nome);
        this.numeroDiPizzeAlGiorno = numeroDiPizzeAlGiorno;
    }


    @Override
    public void siPresenta() {
        System.out.println("Hola, soy il pizzaiolo " + super.getNome() + " e sforno " + this.numeroDiPizzeAlGiorno + " pizze al giorno!!");
    }
}
