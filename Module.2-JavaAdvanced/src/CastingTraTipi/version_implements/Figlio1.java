package CastingTraTipi.version_implements;

public class Figlio1 implements Figlio {
    String attributoFiglio1;

    public Figlio1(String attributoFiglio1) {
        this.attributoFiglio1 = attributoFiglio1;
    }

    public void metodo_Figlio1 () {
        System.out.println("metodo del figlio1");
    }

    @Override
    public void metodoFiglio() {
        System.out.println("sono un Figlio. In particalare, sono il primo");
    }
}
