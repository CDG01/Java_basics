package ListAndMap_Rubrica.src;

/* CONSEGNA:
creare l’interfaccia IRubrica che definisce le funzionalità di base delle rubriche.
Creare due classi di rubriche che implementano l’intefaccia, una basata sulle mappe, l’altra basata sulle liste.

Classe Rubrica_versioneList:
-La classe deve avere i costruttiri per creare due tipi di rubriche:
–Una rubrica con un numero infinito di possibili contatti
–Oppure, una rubrica con un numero limitato di possibili contatti
-La Rubrica deve avere dei metodi di ricerca dei contatti per nome, cogniome, numero o qualsiasi input.

Classe Rubrica_versioneMap:
Deve identificare univocamente ogni contatto con il proprio numero di telefono.
Non completare questa mappa perché i i metodi di ricerca sarebebro complicati rispetto quelli di list in quanto IRubrica ha dichiarato le funzioni passando contatto anziché la chiave di contatto. La conseguenza è che, non potendo cambiare la firma dei metodi da implementare, perdo il vantaggio della mappa, ovvero l’accesso rapido del valore a partire dalla chiave

 */

public class Main {
    public static void main(String[] args) throws Exception {

//        Rubrica rubrica = new Rubrica();
//
//        Contatto contatto1 = new Contatto("Davide", "Busà", "11111", "+39");
//        Contatto contatto2 = new Contatto("Francesco", "Checchia", "22222", "+39");
//        Contatto contatto3 = new Contatto("Emmanuele", "Sartorio", "33333", "+39");
//        ContattoEsteso contatto4 = new ContattoEsteso("Marco", "Ferraro", "44444",
//                "+39", "via delle vie" ,"Montalto Uffugo", "87046", "Cosenza");
//        rubrica.aggiungiContatto(contatto1);
//        rubrica.aggiungiContatto(contatto2);
//        rubrica.aggiungiContatto(contatto3);
//        System.out.println("--------------------- visualizza rubrica");
//        rubrica.visualizzaRubrica();
//        System.out.println("--------------------- elimina contatto");
//        rubrica.rimuoviContatto(contatto1);
//        System.out.println("--------------------- visualizza rubrica");
//        rubrica.visualizzaRubrica();
//        System.out.println("--------------------- cerca con fr");
//        rubrica.cercaContattoPerNome("fr");
//        System.out.println("--------------------- cerca con sar");
//        rubrica.cercaContattoPerCognome("sar");
//        System.out.println("--------------------- cerca con 222");
//        rubrica.cercaContattoPerNumero("222");
//        System.out.println("--------------------- cerca con 222");
//        rubrica.cercaContatto("222");
//        System.out.println("--------------------- Aggiunto contatto esteso");
//        rubrica.aggiungiContatto(contatto4);
//        rubrica.visualizzaRubrica();

        IRubrica iRubrica = new RubricaList();

//        iRubrica.aggiungiContatto("Davide", "Busà", "11111", "+39");
//        iRubrica.aggiungiContatto("Francesco", "Checchia", "22222", "+39");
//        iRubrica.aggiungiContatto("Emmanuele", "Sartorio", "33333", "+39");
//        iRubrica.aggiungiContatto("Marco", "Ferraro", "44444",
//                "+39", "via delle vie" ,"Montalto Uffugo", "87046", "Cosenza");

        Menu menu = new Menu(iRubrica);
        // menu.menu();
    }
}