package DesignPattern.SingletonPattern_User;

/* CONSEGNA:
Crea una classe User che abbia i parametri privati nome ed età e i getter e setter.
All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
Creare due varibili User, che contengano la stessa istanza.
Del primo si stamperanno le informazioni di default,
del secondo si cambieranno le informazioni e poi si stamperanno a video.
*/

// entrambe le variabili si referiranno allo stesso oggetto in memoria perché contengono due riferimenti alla stessa istanza

public class Main {

    public static void main(String[] args) {

        // L'unico modo per ottenere un riferimento all'istanza del sigleton è attraverso il metodo statico getIstance
        User user1 = User.getInstance();
        System.out.println("Informazioni user1");
        user1.printInfo();
        System.out.println();

        User user2 = User.getInstance();
        user2.setName("NomeUser");
        user2.setAge(11);

        System.out.println("Informazioni aggiornate user1 e user2");
        System.out.println("---- Info user1 ----");
        user1.printInfo();
        System.out.println();

        System.out.println("---- Info user2 ----");
        user2.printInfo();
    }

}