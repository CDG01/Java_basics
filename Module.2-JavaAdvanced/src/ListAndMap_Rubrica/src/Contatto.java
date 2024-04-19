package ListAndMap_Rubrica.src;

import java.util.List;

public class Contatto {
    private String nome;
    private String cognome;
    private String id; // identificativo univoco del contatto nella rubrica, sarà assegnato attraverso un contatore numeroContatto in rubrica

    private List<NumeroTelefono> numeroTList;

    public Contatto(String id, String nome, String cognome, List<NumeroTelefono> numeroTList) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.numeroTList = numeroTList;

    }

    public List<NumeroTelefono> getNumeroTList() {
        return numeroTList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    public String getId(){
        return id;
    }


    public boolean verifyPrefisso(String prefisso){
        if(prefisso.length() != 3){
            return false;
        }return true;
    }
    public String stampaNum(){
        String numeri = "";
        for(NumeroTelefono numeroT : numeroTList){
            numeri = numeri + numeroT.getPrefisso() + " " + numeroT.getNumero() + "\n";
        }
        return numeri;
    }

    public boolean containsNum(String input) {
        for(NumeroTelefono numeroT : numeroTList) {
            return numeroT.getNumero().contains(input);
        }
        return false;
    }

    @Override
    public String toString() {
        return
                "id = " + id +
                        ", nome = " + nome  +
                        ", cognome = " + cognome + "\n" + stampaNum();
    }
}