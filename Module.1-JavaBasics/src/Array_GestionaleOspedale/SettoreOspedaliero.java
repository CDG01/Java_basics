package Array_GestionaleOspedale;

import java.util.Arrays;

public class SettoreOspedaliero {
    private int identificativo;
    private String nome;
    private Dottore[] dottori;
    private int numeroDottori;

    public SettoreOspedaliero(int identificativo, String nome, int capacitaDottori) {
        this.identificativo = identificativo;
        this.nome = nome;
        this.dottori = new Dottore[capacitaDottori];
        this.numeroDottori = 0;
    }

    public void aggiungiDottore(Dottore dottore) {
        if (numeroDottori < dottori.length) {
            dottori[numeroDottori++] = dottore;
        } else {
            System.out.println("Limite massimo di dottori raggiunto per questo settore ospedaliero.");
        }
    }

    public static double calcolaMediaPazientiPerSettore(SettoreOspedaliero settoreOspedaliero) {
        return Arrays.stream(settoreOspedaliero.getDottori(), 0, settoreOspedaliero.getNumeroDottori())
                .mapToInt(Dottore::getNumeroPazienti)
                .average()
                .orElse(0);
    }

    public int calcolaNumeroTotalePazienti() {
        return Arrays.stream(dottori, 0, numeroDottori)
                .mapToInt(Dottore::getNumeroPazienti)
                .sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SettoreOspedaliero {\n");
        sb.append("\tidentificativo=").append(identificativo).append(",\n");
        sb.append("\tnome='").append(nome).append("',\n");
        sb.append("\tnumero pazienti del settore='").append(calcolaNumeroTotalePazienti()).append("',\n");
        sb.append("\tnumero pazienti del settore per dottore='").append(calcolaMediaPazientiPerSettore(this)).append("',\n");
        sb.append("\tDottori:\n");
        for (int i = 0; i < numeroDottori; i++) {
            sb.append(dottori[i]).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }

    // Getter e setter per tutti gli attributi

    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dottore[] getDottori() {
        return dottori;
    }

    public void setDottori(Dottore[] dottori) {
        this.dottori = dottori;
    }

    public int getNumeroDottori() {
        return numeroDottori;
    }

    public void setNumeroDottori(int numeroDottori) {
        this.numeroDottori = numeroDottori;
    }
}