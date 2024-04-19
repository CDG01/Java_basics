package DesignPattern.SinletonPattern_UserService;

import java.util.List;

// Classe singleton
public class UserService {
    private static UserService istance;
    public static UserService getInstance(){
        if (istance==null){
            istance = new UserService();
        }
        return istance;
    }

    public void getUserByAge(List<User> utenti, int eta){
        for (User utente : utenti) {
            if (utente.getEta() == eta){
                System.out.println(utente);
            }
        }
    }

    public void getUserByRole(List<User> utenti, Role role){
        for (User utente : utenti) {
            if (utente.getRole() == role){
                System.out.println(utente);
            }
        }
    }

    public float getMediaEta(List<User> utenti){
        float eta=0;
        for (User utente : utenti) {
            eta += utente.getEta();
        }
        return eta / utenti.size();
    }
}

