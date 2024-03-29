import java.util.*;

public class HashMap_3wayInitialization {

    public static void main(String[] args) {

        // primo modo (mutable)
        HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
        hashMap1.put("one",1);
        hashMap1.put("three",3);
        hashMap1.put("two",2);

        // secondo modo (immutable)
        HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>(Map.of("one",1, "two", 2, "three",3));

        HashMap<String, Integer> hashMap3 = new HashMap<String, Integer>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String, Integer>("one",1),
                new AbstractMap.SimpleEntry<String, Integer>("two", 2),
                new AbstractMap.SimpleEntry<String, Integer>("three",3)
        ));

        // attraversamento di un qualsiasi HashMap :
        for (Map.Entry<String, Integer> entry : hashMap1.entrySet()) {
            System.out.println(entry);
        }

        // collection formata dei valori
        Collection<Integer> valuesCollection = hashMap1.values();
        System.out.println(valuesCollection);
        // ArrayList formata dai valori
        ArrayList<Integer> valuesArrayList = new ArrayList<>(valuesCollection);
        // riordinamento dei valori
        Collections.sort(valuesArrayList);
        System.out.println(valuesArrayList);
    }
}
