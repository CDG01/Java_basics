package Compare_Explanation.example3_ComparingVersion;

/*
Java 8 provides new ways of defining Comparators by using:
- modo1: lambda expressions,
- modo2: the comparing() static factory method.
 */

import LambdaExpresssion_Operazioni.Operazioni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<Player>(); // non sto istanzando una istanza di una classe anonima, sto facendo un casting implicito di una istanza della classe ArrayList a un'istanza di una classe che implementa l'interfaccia List, perché è quello che può contenere la variabile per come è dichiarata -> su questa variabile non potrò chiamare metodi e attributi della classe ArrayList a meno che io non "torni indietro" fcendo un casting esplicito a ArrayList
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
        System.out.println("Before Sorting : " + footballTeam);

        // Modo 0: classe anonima
        // in java non è possibile istanziare un interfaccia, qui istanzio una istanza di una classe anonima. E' un metodo compatti/sintetico per saltare il passagio di dichiarare e implementare a parte una classe.
        // Infatti, attraverso questa sintassi, scrivo solo il corpo della classe anonima, che è quello che è scritto tra graffe. Fuori dalle graffe, indico che la classe anonima implementa il comparatore.
        // L'istanza della classe anonima a destra dell'ugale è assegnata a una variabile che può contenere l'istanza di una classe che implementa l'interfaccia Comparator. QUindi è un casting implicito.
        // Ha senso usare questo metodo per creare una classe al volo che voglio istanziare solo una volta
        Comparator<Player> anonymousComparatorbyRanking = new Comparator<Player>() {
            @Override
            public int compare(Player firstPlayer, Player secondPlayer) {
                return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
            }
        };
        Collections.sort(footballTeam, anonymousComparatorbyRanking);
        System.out.println("After Sorting by ranking: " + footballTeam);


        // Modo 1: lambda expression to create a Comparator
        // a destra dell'uguale faccio esattemente la stessa cosa che ho fatto nel  MODO 0: istanzio una istanza di una classe anonima però con una lambda expression
        // la lambda expression fa riferimento alla l'interfaccia funzionale che di solito ha un solo metodo
        Comparator<Player> playerComparatorByRanking = (playerVariable1, playerVariable2)
                -> Integer.compare(playerVariable1.getRanking(), playerVariable2.getRanking());
        Collections.sort(footballTeam, playerComparatorByRanking);
        System.out.println("After Sorting by ranking: " + footballTeam);


        // Modo 2: Comparator.comparing method takes a method calculating the property that will be used for comparing items,
        // and returns a matching Comparator instance
        Comparator<Player> playerComparatorByAge = Comparator.comparing(Player::getAge); // double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class directly
        Collections.sort(footballTeam, playerComparatorByAge);
        System.out.println("After Sorting by ranking: " + footballTeam);

    }
}
