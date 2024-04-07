package checkpoint1.soluzione;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Personaggio p1 = new Personaggio("Gandalf", Razza.STREGONE,
                0, 0, 100, 30, 50);
        Personaggio p2 = new Personaggio("Legolas", Razza.ELFO,
                0, 0, 150, 80, 20);

        p1.muovi(50,30);
        p2.muoviOffset(10,30);
        p2.muoviOffset(40,0);


        Combattimento combattimento = new Combattimento(Modalita.TWOVSTWO);
        combattimento.aggiungiPartecipante(p1);
        combattimento.aggiungiPartecipante(p2);


        combattimento.attacco(p1, p2);
        combattimento.attacco(p2, p1);


        combattimento.stampaStatusPartecipanti();
    }
}