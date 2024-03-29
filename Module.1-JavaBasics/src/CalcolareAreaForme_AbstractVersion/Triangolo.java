package CalcolareAreaForme_AbstractVersion;

public class Triangolo extends Forma{
    double base;
    double altezza;


    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;

    }
    @Override
    public void calcolaArea() {
        System.out.println("L'area del triangolo è base*altezza/2 = " + base*altezza/2);
    }
}
