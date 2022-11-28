package treemap;


import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
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