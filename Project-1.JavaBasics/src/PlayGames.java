/* CONSEGNA
Creare un gioco con un menù che ci sposti tra i vari minigiochi.
 Il menu prenderà input da tastiera come int, se premo 0 dovrà uscire dal programma.
 Premendo 1 entro nel gioco indovina il numero, se premo 2 entrerà nel generatore di frasi casuali.
 indovina il numero : 
    Scrivi una funzione che gioca a nascondino con l'utente.
     * La funzione dovrebbe generare un numero casuale tra 1 e 100 e chiedere all'utente di indovinarlo.
     * Se l'utente indovina il numero, la funzione dovrebbe stampare "Hai vinto!".
     * Altrimenti, la funzione dovrebbe stampare "Hai sbagliato! Il numero era {numero_casuale}".
 generatore di frasi casuali :
    La funzione dovra generare frasi in maniera casuale(math.random)prendendo il sogetto il verbo il complemento e l'aggiunta 
    da degli array predefiniti 
*/

import java.util.Random;
import java.util.Scanner;

public class PlayGames {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        int giocare;
        System.out.println("Benvenuto!");
        do {
            System.out.println("SELEZIONA UN MINIGIOCO:");
            System.out.println("Digita 1 se vuoi giocare ad indovina il numero");
            System.out.println("Digita 2 se vuoi giocare ad generatore di frasi casuali");
            System.out.println("Digita 0 per uscire dal programma");
            try {
                giocare = scanner.nextInt();
            } catch (Exception e) {
                giocare = 4;
                scanner.nextLine();
            }
            switch (giocare) {
                case 1:
                    indovinaNumero();
                    break;
                case 2:
                    generaFrase();
                    break;
                case 0:
                    System.out.println("Arrivederci");
                    scanner.close();
                    break;
                default:
                    System.out.println("Input errato, riprova."+  "\n");
                    break;
            }
        } while (giocare != 0);
    }

    public static void generaFrase() {
        System.out.println( "\n" + "HAI SELEZIONATO IL MINIGIOCO 'GENERA FRASE':");

        String[] soggetti = {"Il pollo", "La scimmia", "Il pinguino", "Il coccodrillo", "La giraffa", "Il koala", "Il leone", "Il dinosauro", "Il camaleonte", "Il gatto", "Il coniglio", "Il panda", "Il rinoceronte", "Il serpente", "Il tucano", "Il delfino", "Il gufo", "Il cavallo", "Il topo", "La volpe", "Il bradipo", "Il lupo", "La tartaruga", "Il rospo", "Il pellicano", "Il pappagallo", "L'orso", "Il pipistrello", "Il riccio", "Il furetto"};
        String[] verbi = {"balla", "mangia", "suona", "legge", "dorme", "nuota", "salta", "ride", "scrive", "vola", "corre", "studia", "abbaia", "canta", "piange", "cucina", "gioca", "nuota", "lavora", "vola", "spazza", "ascolta", "guarda", "viaggia", "cammina", "abbraccia", "pedala", "racconta", "dipinge", "sogna"};
        String[] complementi = {"sul tetto", "nella vasca da bagno", "al parco giochi", "sulla luna", "nel frigorifero", "sotto il letto", "nel deserto", "al cinema", "nella giungla", "sul palco", "nel fiume", "nella foresta", "sulla spiaggia", "sul prato", "nel bosco", "nel campo", "in città", "nel giardino", "sul divano", "nella caverna", "sul balcone", "nel castello", "sul treno", "in ufficio", "nel parco", "nel laboratorio", "in cucina", "in bagno", "in montagna", "nel deserto"};
        String[] aggiunte = {"mentre mangia gelato", "con una parrucca colorata", "mentre suona il violino", "con gli occhiali da sole", "con una mela in mano", "in un vestito da sposa", "con un cappello da cowboy", "con una valigia piena di soldi", "con una sciarpa a pois", "mentre legge un giornale", "con una banana in mano", "con una maschera da supereroe", "con un ombrello colorato", "con un bastone da passeggio", "con un sacchetto di popcorn", "con una macchina fotografica", "con un libro di cucina", "con una tavola da surf", "con un martello e chiodi", "con un fiore in bocca", "con un bastone da escursionismo", "con un paio di binocoli", "con un microfono", "con un mazzo di fiori", "con un cappotto rosso", "con un grembiule da cucina", "con una conchiglia in mano", "con una palla da calcio", "con una mappa del tesoro", "con una lanterna"};

        // indici che devono essere numeri interi casuali tra 0 e 29 compresi gli estremi
        Random random = new Random();
        int indSog = random.nextInt(30);
        int indVer = random.nextInt(30);
        int indCom = random.nextInt(30);
        int indAgg = random.nextInt(30);
        System.out.println(soggetti[indSog] + " " + verbi[indVer] + " " + complementi[indCom] + " " + aggiunte[indAgg]);
        System.out.println("FINE MINIGIOCO 'GENERA FRASE'" + "\n");
    }

    public static void indovinaNumero() {
        System.out.println( "\n" + "HAI SELEZIONATO IL MINIGIOCO 'INDOVINA NUMERO'");

        System.out.println("Indovina a quale numero intero sto pensando:");

        try {
            int guessNumber = scanner.nextInt();
            int risposta = 1;
            guessNumIsRight(guessNumber);
            do {
                System.out.println("vuoi giocare ancora? premi 1 per si o 0 per tornare al menù principale");
                try {
                    risposta = scanner.nextInt();
                    if (risposta == 1) {
                        System.out.println("Inserisci un nuovo numero");
                        guessNumber = scanner.nextInt();
                        guessNumIsRight(guessNumber);
                    } else if (risposta == 0) {
                        System.out.println("FINE MINIGIOCO 'INDOVINA NUMERO'" + "\n");
                    } else {
                        System.out.println("input errato.");
                    }
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("input errato");
                }
            } while (risposta != 0);
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Certamente non stavo pensado a questo, dato che non è un numero intero :)"+  "\n");
        }
    }

    public static void guessNumIsRight(int guess) {
        int randomNumber = (int) (Math.random() * 100);
        if (guess == randomNumber) {
            System.out.println("Complimenti hai indovinato!!!" + "\n");
        } else {
            System.out.println("Peccato hai sbagliato, il numero corretto era: " + randomNumber);
        }
    }

}