package LambdaExpresssion_Operazioni;

public class Main {
    public static void main(String[] args) {
        // a sinistra istanzio due istanze di due classi anonime che implemntano l'interfaccia Operazioni scrivendo solo l'implementazione del singolo metodo dell'interfaccia funzionale
        // e le assegno a quello che c'è a dx dell'uguale, ovvero, a una variabile che può contenere istanze di classi che implementano l'interfaccia operazioni
        Operazioni somma = (a, b) -> a+b;  // l'istanza somma è lunica istanza di una classe che contiene solo il metodo definito a dx. Quindi, in pratica, l'istanza "corrisponde" alla sua classe anonima
        Operazioni moltiplicazione = (a, b) -> a*b;

        int risultato = somma.calcola(3,4);
        int risultato2 = somma.calcola(5,6);
        // posso riutilizzare l'istanza della classe anonima quante volte voglio ma solo all'interno del metodo main perché l'istanza e la classe anonima stessa sono definite solo qui dentro
        // se al posto della classe anonima avessi creato separatamente una classe pubblica, avrei potuto istanziarla ovunque, non sono dentro main!

        System.out.println(risultato);
    }
}
