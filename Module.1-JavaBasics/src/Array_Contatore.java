import java.util.Arrays;

public class Array_Contatore {

    public static void main(String[] args) {
        String[] strighe = new String[4];
        int contatore = 0;
        strighe[contatore ++]="ciao";
        System.out.println(Arrays.toString(strighe));
        System.out.println("contatore: " + contatore);
        strighe[contatore --]="addio";
        System.out.println(Arrays.toString(strighe));
        System.out.println("contatore: " + contatore);

    }

}
