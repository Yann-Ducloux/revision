package treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_nullElement_ex1 {

    public static void main(String[] args) {
        // Comparator.nullsFirst
        // Comparator.nullsLast
        Comparator<String> comparator = Comparator.nullsFirst(Comparator.naturalOrder());

        // Create a SortedSet object.
        SortedSet<String> map = new TreeSet<String>(comparator);

        map.add("B");
        map.add("A");
        map.add("F");
        map.add(null);
        map.add(null);
        map.add("D");
        map.add("E");

        System.out.println(map);
    }
}