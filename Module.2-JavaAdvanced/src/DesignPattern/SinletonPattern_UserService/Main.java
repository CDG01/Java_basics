package DesignPattern.SinletonPattern_UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> utenti = new ArrayList<>();
        utenti.add(new User("utente1", 21, Role.USER));
        utenti.add(new User("utente2", 22, Role.MODERATOR));
        utenti.add(new User("utente3", 22, Role.ADMIN));

        UserService userService = UserService.getInstance();

        System.out.println("Età media degli utenti: " + userService.getMediaEta(utenti) );

        System.out.println("AdMINS: " );
        userService.getUserByRole(utenti, Role.ADMIN);

        System.out.println("i ventiduenni: " );
        userService.getUserByAge(utenti, 22);


    }
}
