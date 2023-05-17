import java.util.*;

public class LinkedListImplementation {
    public static void main(String[] args) {

        LinkedList<Integer> obj = new LinkedList<Integer>();

        obj.add(1);
        obj.add(2);
        obj.addLast(3);
        obj.add(4);
        obj.addFirst(5);
        
        System.out.println(obj);
        
        System.out.println(obj.removeFirst());
        System.out.println(obj);
    }
}
