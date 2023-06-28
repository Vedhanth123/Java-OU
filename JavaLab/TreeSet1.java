package JavaLab;

import java.util.*;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<Integer>();

        obj.add(100);
        obj.add(200);
        obj.add(300);
        obj.add(400);

        System.out.println(obj.subSet(100, false, 400, false));
    }
}
