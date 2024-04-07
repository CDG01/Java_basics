package CastingTraTipi.version_estends;

public class Figlio1 extends Padre{
    String attributoFiglio1;

    public Figlio1(String attributoPadre, String attributoFiglio1) {
        super(attributoPadre);
        this.attributoFiglio1 = attributoFiglio1;
    }

    public void metodo_Figlio1 () {
        System.out.println("metodo del figlio1");
    }
}
