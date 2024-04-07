package CastingTraTipi.version_estends;

/* LEGENDA:
   commenti con il doppio backslash:= righe di codice che danno errore
   commenti con il triplo backslash:= Titoli o spiegazioni del paragrafo di codice sottostante
*/

public class Main {
    public static void main(String[] args) {
        Padre figlio1 = new Figlio1("attributoPadre di figlio1", "attributoFiglio1 di figlio1"); // casting implicito da Figlio1 a Padre
        Figlio2 figlio2 = new Figlio2("attributoPadre di figlio2", "attributoFiglio2 di figlio2");

        /// Posso chiamare i metodi e attributi dei figli solo se non sono stati castati a Padre
        // figlio1.metodo_Figlio1();
        // System.out.println(figlio1.attributoFiglio1);
        figlio2.metodo_Figlio2();
        System.out.println(figlio2.attributoFiglio2);

        /// Posso chiamare i metodi del padre sui figli
        figlio1.metodoPadre();
        figlio2.metodoPadre();

        Padre figlio2_versionePadre = figlio2; // casting implicito da Figlio2 a Padre
        Figlio2 figlio2_versioneFiglio2 = (Figlio2) figlio2_versionePadre; // casting esplicito da Padre a Figlio2
        // Figlio1 figlio2_versioneFiglio1 = (Figlio1) figlio2_versionePadre; // non posso fare casting esplicito da Padre a Figlio1
        figlio2_versioneFiglio2.metodo_Figlio2();

        /// non si può fare un casting esplicito di un Padre a un figlio
        Padre padre = new Padre("attriputoPadre di Padre");
        Figlio1 padre_versionefiglio1 = (Figlio1) padre;
        //padre_versionefiglio1.metodo_Figlio1();
    }
}
