package treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_reverseOrder_ex1 {

    public static void main(String[] args) {
        Comparator<Integer> reverseOrderComparator = Comparator.reverseOrder();

        TreeSet<Integer> set = new TreeSet<>(reverseOrderComparator);
        //
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(7);
        set.add(1);
        set.add(11);

        System.out.println(set);
    }
}