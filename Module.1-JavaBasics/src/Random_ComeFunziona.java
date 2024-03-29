import java.util.Random;

public class Random_ComeFunziona {

    public static void main(String[] args) {
        Random randomInstance;
        // System.out.println(random); non posso stampare perché la variabile non è inizializzata
        randomInstance = new Random();
        int randomInt = randomInstance.nextInt(6);
        System.out.println(randomInt); // cerco di stampare un intero casuale tra 0 e 5
        System.out.println(randomInstance);                   // cerco di stampare un istanza dell'oggetto

        int randomInt2 = randomInstance.nextInt(6);  // verifico se mi serve un latra istanza per avere un altro numero casuale
        System.out.println(randomInt2);
    }
}
