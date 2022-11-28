package treeset;

import java.util.TreeSet;

public class TreeSetEx1 {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
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