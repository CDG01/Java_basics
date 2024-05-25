package Array_GestionaleOspedale;

import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        // Istanziamento  dottori
        Dottore dottore1 = new Dottore(1, "Mario", "Rossi", "Cardiologo", 10);
        Dottore dottore2 = new Dottore(2, "Luigi", "Bianchi", "Chirurgo", 8);
        Dottore dottore3 = new Dottore(3, "Giovanna", "Verdi", "Pediatra", 5);

        // Creazione di un settore ospedaliero
        SettoreOspedaliero settore = new SettoreOspedaliero(1, "Settore 1", 4);

        // Aggiunta dei dottori al settore
        settore.aggiungiDottore(dottore1);
        settore.aggiungiDottore(dottore2);

        // Aggiunta di pazienti ad alcuni dottori
        dottore1.aggiungiPaziente("Carlo Rossi");
        dottore1.aggiungiPaziente("Giulia Verdi");
        dottore2.aggiungiPaziente("Luca Bianchi");
        dottore2.aggiungiPaziente("Matteo Bianchi");

        // Stampa di tutte le informazioni relative al settore ospedaliero
        System.out.println(settore);

        // Esempi di ricerca con chiamate differenti

        // Ricerca di un paziente presente facendo un check esplicito sull'optional con isPresent() e get()
        Optional<String> optRicerca = dottore1.ricercaPaziente("Carlo");
        String ricerca1;
        if (optRicerca.isPresent()){
            ricerca1 = optRicerca.get();
        } else {
            ricerca1 = "Paziente non trovato";
        }
        System.out.println("Risultato della ricerca tra i pazienti del dottor "
                + dottore1.getCognome() + " " + dottore1.getNome()  +": " + ricerca1);


        // Ricerca di un paziente non presente gestendo con l'orElse in automatico
        String ricerca2 = dottore1.ricercaPaziente("Francesco").orElse("Paziente non trovato");
        System.out.println("Risultato della ricerca tra i pazienti del dottor "
                + dottore1.getCognome() + " " + dottore1.getNome()  +": " + ricerca2);


        // Ricerca v2
        List<String> pazientiTrovati = dottore2.ricercaPazienteV2("Bianchi");
        if (!pazientiTrovati.isEmpty()) {
            System.out.println("Pazienti trovati per il dottor: " + dottore2.getCognome() + " " + dottore2.getNome() );
            for (String paziente : pazientiTrovati) {
                System.out.println(paziente);
            }
        } else {
            System.out.println("Nessun paziente trovato.");
        }
    }
}