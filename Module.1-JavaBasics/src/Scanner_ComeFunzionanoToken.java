/*
come funziona il "next token" e il buffer della classe scanner?
I token (ogni parola/numero circondato da spazi) rimangono nel buffer finché non vengono letti
 */

import java.util.Scanner;

public class Scanner_ComeFunzionanoToken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Inserisci una sequenza di numeri");
                float num1 = scanner.nextFloat();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("fine, inserisci un token:");
                scanner.next();
            }
        }


    }

}
