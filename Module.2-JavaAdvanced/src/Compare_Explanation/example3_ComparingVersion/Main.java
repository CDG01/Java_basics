package Compare_Explanation.example3_ComparingVersion;

/*
Java 8 provides new ways of defining Comparators by using:
- modo1: lambda expressions,
- modo2: the comparing() static factory method.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<Player>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
        System.out.println("Before Sorting : " + footballTeam);

        // Modo 0: classe anonima
        Comparator<Player> anonymousComparatorbyRanking = new Comparator<Player>() {
            @Override
            public int compare(Player firstPlayer, Player secondPlayer) {
                return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
            }
        };
        Collections.sort(footballTeam, anonymousComparatorbyRanking);
        System.out.println("After Sorting by ranking: " + footballTeam);


        // Modo 1: lambda expression to create a Comparator
        Comparator<Player> playerComparatorByRanking = (playerVariable1, playerVariable2)
                -> Integer.compare(playerVariable1.getRanking(), playerVariable2.getRanking());
        Collections.sort(footballTeam, playerComparatorByRanking);
        System.out.println("After Sorting by ranking: " + footballTeam);


        // Modo 2: Comparator.comparing method takes a method calculating the property that will be used for comparing items,
        // and returns a matching Comparator instance
        Comparator<Player> playerComparatorByAge = Comparator.comparing(Player::getAge);
        Collections.sort(footballTeam, playerComparatorByAge);
        System.out.println("After Sorting by ranking: " + footballTeam);

        // anonymous class - part2
        Operazioni somma = (a, b) -> a+b;
        Operazioni moltiplicazione = (a, b) -> a*b;

        int risultato = somma.calcola(3,4);
        int risultato2 = somma.calcola(5,6);

        System.out.println(risultato);
    }
}
