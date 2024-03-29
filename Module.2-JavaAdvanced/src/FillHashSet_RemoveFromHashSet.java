/* CONSEGNA:
Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato

Implementate una ricerca nel set a partire da un valore di input, se lo trovate allora lo togliete dal set.
Fate in modo di trovare tutti i valori con cui avete popolato il set in modo che rimanga vuoto.
A quel punto stampate il set per vedere che sia effettivamente vuoto.
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class FillHashSet_RemoveFromHashSet {
    public static void main(String[] args) {
        String[] arr = {"one","two"};
        String oneMoreElement = "oneMoreElement";

        HashSet<String> hashset = fillHashSet(arr);
        hashset.add(oneMoreElement);
        System.out.println(hashset.contains(oneMoreElement));
        System.out.println(hashset);

        removeFormHashSet(hashset, "oneMoreElement");
        removeFormHashSet(hashset, "one");
        removeFormHashSet(hashset, "two");
        System.out.println(hashset);
    }

    public static HashSet<String> fillHashSet(String[] arr){
        return new HashSet<String>(Arrays.asList(arr));
    }

    public static HashSet<String> removeFormHashSet(HashSet<String> hashSet, String elementToRemove) {
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals(elementToRemove)) {
                iterator.remove();
            }
        }
        return hashSet;
    }
}
