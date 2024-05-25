package Array_GestionaleOspedale;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Dottore {
    private int id;
    private String nome;
    private String cognome;
    private String specializzazione;
    private int anniEsperienza;
    private String[] pazienti;
    private int numeroPazienti;

    public Dottore(int id, String nome, String cognome, String specializzazione, int anniEsperienza) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.specializzazione = specializzazione;
        this.anniEsperienza = anniEsperienza;
        this.pazienti = new String[200];
        this.numeroPazienti = 0;
    }


    public void aggiungiPaziente(String nomeCognome) {
        if (numeroPazienti < 200) {
            pazienti[numeroPazienti++] = nomeCognome;
        } else {
            System.out.println("Limite massimo di pazienti raggiunto per questo dottore.");
        }
    }

    public Optional<String> ricercaPaziente(String inputToSearch) {

        return Arrays.stream(pazienti, 0, numeroPazienti)
                .filter(paziente -> paziente.toLowerCase().contains(inputToSearch.toLowerCase()))
                .findFirst();
    }

    public List<String> ricercaPazienteV2(String inputToSearch) {

        return Arrays.stream(pazienti, 0, numeroPazienti)
                .filter(paziente -> paziente.toLowerCase().contains(inputToSearch.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\tDottore: ").append(nome).append(" ").append(cognome).append("\n");
        sb.append("\t\tSpecializzazione: ").append(specializzazione).append("\n");
        sb.append("\t\tAnni di esperienza: ").append(anniEsperienza).append("\n");
        sb.append("\t\tPazienti:\n");
        StringBuilder pazientiStr = new StringBuilder();
        for (int i = 0; i < numeroPazienti; i++) {
            pazientiStr.append(pazienti[i]).append(",");
        }
        sb.append("\t\t\t").append(pazientiStr);
        return sb.toString();
    }


    // Getter e setter per tutti gli attributi
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public int getAnniEsperienza() {
        return anniEsperienza;
    }

    public void setAnniEsperienza(int anniEsperienza) {
        this.anniEsperienza = anniEsperienza;
    }

    public String[] getPazienti() {
        return pazienti;
    }

    public void setPazienti(String[] pazienti) {
        this.pazienti = pazienti;
    }

    public int getNumeroPazienti() {
        return numeroPazienti;
    }

    public void setNumeroPazienti(int numeroPazienti) {
        this.numeroPazienti = numeroPazienti;
    }

}