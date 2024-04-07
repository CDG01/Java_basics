package CastingTraTipi.version_estends;

public class Figlio2 extends Padre {

    String attributoFiglio2;

    public Figlio2(String attributoPadre, String attributoFiglio2) {
        super(attributoPadre);
        this.attributoFiglio2 = attributoFiglio2;
    }

    public void metodo_Figlio2 () {
        System.out.println("metodo del figlio2");
    }
}
