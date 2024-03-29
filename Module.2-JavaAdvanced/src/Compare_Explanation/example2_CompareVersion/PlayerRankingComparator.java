package Compare_Explanation.example2_CompareVersion;

/*
To create a Comparator, we have to implement the Comparator interface.

For this example, we’ll create a Comparator to use the ranking attribute of Player to sort the players:
 */

import java.util.Comparator;

public class PlayerRankingComparator implements Comparator<Player> {
    public int compare(Player firstPlayer, Player secondPlayer) {
        return Integer.compare(firstPlayer.getRanking(), secondPlayer.getRanking());
    }
}
