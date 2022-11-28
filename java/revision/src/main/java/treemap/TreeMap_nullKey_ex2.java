package treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_nullKey_ex2 {

    public static void main(String[] args) {
        Comparator<String> comparator = new StringNullComparator();

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
// The comparator supports null comparison.
class StringNullComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1 == o2) {
            return 0; // o1 = o2
        }
        if(o1 == null)  {
            return -1; // o1 < o2
        }
        if(o2 == null)  {
            return 1; // o1 > o2
        }
        return o1.compareTo(o2);
    }
}