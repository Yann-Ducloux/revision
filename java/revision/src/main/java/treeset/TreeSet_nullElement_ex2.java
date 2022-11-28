package treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_nullElement_ex2 {

    public static void main(String[] args) {
        Comparator<String> comparator = new StringNullComparator();

        // Create a SortedSet object.
        SortedSet<String> map = new TreeSet<String>(comparator);

        map.add("B");
        map.add("A");
        map.add("F");
        map.add(null);
        map.add("D");
        map.add("E");

        System.out.println(map);
    }
}

// The comparator supports null comparison.
class StringNullComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1 == o2) {
            return 0; // o1 = o2
        }
        if (o1 == null) {
            return -1; // o1 < o2
        }
        if (o2 == null) {
            return 1; // o1 > o2
        }
        return o1.compareTo(o2);
    }
}