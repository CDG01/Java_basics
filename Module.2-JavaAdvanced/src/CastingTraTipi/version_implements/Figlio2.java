package CastingTraTipi.version_implements;

public class Figlio2 implements Figlio {

    String attributoFiglio2;

    public Figlio2(String attributoFiglio2) {
        this.attributoFiglio2 = attributoFiglio2;
    }

    public void metodo_Figlio2 () {
        System.out.println("metodo del figlio2");
    }

    @Override
    public void metodoFiglio() {
        System.out.println("sono un Figlio. In particalare, sono il secondo");
    }
}
