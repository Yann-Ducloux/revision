package treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_nullKey_ex1 {

    public static void main(String[] args) {
        // Comparator.nullsFirst
        // Comparator.nullsLast
        Comparator<String> comparator = Comparator.nullsFirst(Comparator.naturalOrder());

        // Create a SortedSet object.
        SortedMap<String, Integer> map = new TreeMap<String, Integer>(comparator);

        map.put(null, 0);
        map.put("B", 100);
        map.put("A", 200);
        map.put("F", 400);
        map.put("D", 500);
        map.put("E", 100);

        System.out.println("--- keySet ---");
        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " --> " + map.get(key));
        }

        System.out.println("--- entrySet ---");
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

        for (Map.Entry<String,Integer> entry: entrySet) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}