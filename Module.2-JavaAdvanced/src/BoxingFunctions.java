/* CONSEGNA:
Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing
 */

public class BoxingFunctions {
    public static void main(String[] args) {
        // Autoboxing
        Double double11 = 1.1; // Autoboxing del double 1.1
        Integer integer1 = 1; // Autoboxing dell'int 1
        Character characterA = 'a'; // Autoboxing del char 'a'

        // Unboxing
        int int1 = integer1; // Unboxing del Integer 1
        double double110 = double11; // Unboxing del Double 1.1
        char charA = characterA; // Unboxing del Character 'a'

        // Chiamate alle funzioni
        printSumOfInt(5, 3);
        printChar('X');
        printSumOfInteger(10, 20);
        printCharacter('Y');
    }

    public static void printSumOfInt(int int1, int int2) {
        System.out.println("La somma è: " + (int1 + int2));
    }

    public static void printChar(char charA) {
        System.out.println("Il carattere è: " + charA);
    }

    public static void printSumOfInteger(Integer integer1, Integer integer2) {
        System.out.println("La somma è: " + (integer1 + integer2));
    }

    public static void printCharacter(Character characterA) {
        System.out.println("Il carattere è: " + characterA);
    }
}
