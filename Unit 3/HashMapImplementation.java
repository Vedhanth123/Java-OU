import java.util.*;

public class HashMapImplementation {
    
    public static void main(String[] args) {

        HashMap<Integer, String> obj = new HashMap<Integer, String>();

        obj.put(100, "Vedhanth");
        obj.put(200, "Joker");
        obj.put(300, "Idiot");
        obj.put(400, "Joker");


        // obtaining a set version of the HashMap
        Set<Map.Entry<Integer, String>> so = obj.entrySet();

        for(Map.Entry<Integer, String> x : so)
        {
            System.out.println(x);
        }

        System.out.println(obj.get(200));
    }
}
