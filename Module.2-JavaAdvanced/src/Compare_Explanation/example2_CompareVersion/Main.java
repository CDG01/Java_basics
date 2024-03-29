package Compare_Explanation.example2_CompareVersion;/*
example_ComparableVersion show natural ordering with Comparable, let’s see how we can use other types of ordering in a more
flexible manner than by directly implementing an interface.

The Comparator interface defines a compare(arg1, arg2) method with two arguments that represent compared objects,
and works similarly to the Comparable.compareTo() method.
 */


import java.util.ArrayList;
import java.util.Collections;
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


        /*
        introducing a second argument to the Collections.sort method,
        (which is actually the instance of Comparator we want to use),
        we can override the natural ordering defined in the class Player.
         */

        PlayerRankingComparator playerComparatorByRanking = new PlayerRankingComparator();
        Collections.sort(footballTeam, playerComparatorByRanking);
        System.out.println("After Sorting by ranking: " + footballTeam);

        PlayerAgeComparator playerComparatorByAge = new PlayerAgeComparator();
        Collections.sort(footballTeam, playerComparatorByAge);
        System.out.println("After Sorting by age: " + footballTeam);
    }
}
