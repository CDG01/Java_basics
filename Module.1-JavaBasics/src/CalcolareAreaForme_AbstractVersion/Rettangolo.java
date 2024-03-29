package CalcolareAreaForme_AbstractVersion;

public class Rettangolo extends Forma{
    double base;
    double altezza;


    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è base*altezza = " + base*altezza);
    }
}
