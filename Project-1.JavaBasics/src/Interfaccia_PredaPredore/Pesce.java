package Interfaccia_PredaPredore;

public class Pesce implements Preda, Predatore{
    @Override
    public void scappa() {
        System.out.println("Il pesce fugge nuotando via");
    }

    @Override
    public void caccia() {
        System.out.println("Un pesce può cacciare altri esseri viventi");
    }
}
