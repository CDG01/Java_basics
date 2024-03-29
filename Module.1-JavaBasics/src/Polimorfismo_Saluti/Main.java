package Polimorfismo_Saluti;

public class Main {
    public static void main(String[] args) {
        Avvocato avvocato = new Avvocato("Andrea");
        Pizzaiolo pizzaiolo = new Pizzaiolo("Mario", 34);

        Persona[] personas = {avvocato, pizzaiolo};

        Persona.presentazione(personas);
    }
}
