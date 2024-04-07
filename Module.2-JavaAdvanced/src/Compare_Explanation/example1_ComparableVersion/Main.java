package Compare_Explanation.example1_ComparableVersion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Roger", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);

        // il metodo statico sort() dell'interfaccia Collection prende l'istanza di una classe che implementa Collection e,
        // nel caso gli viene passato solo questo parametro, li riordina in base a come è definito ComplateTo della
        // Classe di cui è stata passata l'istanza.
        // Dentro sort() viene usato compareTo() implementato dalla classe per comparare uno a uno gli elemnti contenuti nell'istanza
        // con un algoritmo che dovrebbe chiamarsi quicksort
        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);
    }
}
