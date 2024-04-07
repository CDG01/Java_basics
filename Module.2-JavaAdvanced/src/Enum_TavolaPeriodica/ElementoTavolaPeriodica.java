package Enum_TavolaPeriodica;

public enum ElementoTavolaPeriodica {
    IDROGENO("H",1, 1.008),
    ELIO("He", 2, 4.003); // solo l'ultimo elemento dell'enum deve avere il punto e virgola

    private String simbolo;
    private int numeroAtomico;
    private double massaAtomica;

    ElementoTavolaPeriodica(String simbolo, int numeroAtomico, double massaAtomica) {
        this.simbolo = simbolo;
        this.numeroAtomico = numeroAtomico;
        this.massaAtomica = massaAtomica;
    }

    // i gettter servono perché gli attributi sono private
    public String getSimbolo() {
        return simbolo;
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public double getMassaAtomica() {
        return massaAtomica;
    }
}
