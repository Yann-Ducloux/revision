package treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_reverseOrder_ex1 {

    public static void main(String[] args) {
        Comparator<Integer> reverseOrderComparator = Comparator.reverseOrder();

        TreeMap<Integer, String> map = new TreeMap<>(reverseOrderComparator);
        //
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(9, "Nine");
        map.put(7, "Seven");
        map.put(1, "One");
        map.put(11, "Eleven");

        Set<Integer> keys = map.keySet();

        System.out.println(keys);

        for(Integer key: keys)  {
            System.out.println(key + " --> " + map.get(key));
        }
    }
}