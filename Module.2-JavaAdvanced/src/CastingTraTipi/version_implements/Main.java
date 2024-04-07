package CastingTraTipi.version_implements;

/* LEGENDA:
   commenti con il doppio backslash:= righe di codice che danno errore
   commenti con il triplo backslash:= Titoli o spiegazioni del paragrafo di codice sottostante
*/

public class Main {
    public static void main(String[] args) {
        Figlio figlio1 = new Figlio1( "attributoFiglio1 di figlio1"); // casting implicito dalla classe Figlio1 all'intefaccia Figlio
        Figlio2 figlio2 = new Figlio2( "attributoFiglio2 di figlio2");

        /// Posso chiamare i metodi e attributi di classe solo se non sono stati castati all'intefaccia Figlio
        // figlio1.metodo_Figlio1();
        // System.out.println(figlio1.attributoFiglio1);
        figlio2.metodo_Figlio2();
        System.out.println(figlio2.attributoFiglio2);

        /// Posso chiamare i metodi dell'intefaccia Figlio sulle classi che l'hanno implementata
        figlio1.metodoFiglio();
        figlio2.metodoFiglio();

        Figlio figlio2_versioneFiglio = figlio2; // casting implicito da Figlio2 a Figlio
        Figlio2 figlio2_versioneFiglio2 = (Figlio2) figlio2_versioneFiglio; // casting esplicito da Padre a Figlio2
        // Figlio1 figlio2_versioneFiglio1 = (Figlio1) figlio2_versionePadre; // non posso fare casting esplicito da Figlio a Figlio1
        figlio2_versioneFiglio2.metodo_Figlio2();

        /// istanzio una istanza di una classe anonima che implemnta Figlio e ne faccio il casting implicito all'interfaccia Figlio
        Figlio figlio_istanzaDiClasseAnonima = new Figlio() {
            @Override
            public void metodoFiglio() {
                System.out.println("Sono un figlio generico");
            }
        };
    }
}
