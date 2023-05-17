
import java.util.*;

// implementing array list in java 
public class ArrayListImplementation {
    
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();

        al.add("A");
        al.add("B");
        al.add("C");

        System.out.println(al);

        String arr[] = new String[al.size()];

        arr = al.toArray(arr);

        for (String i : arr)
        {
            System.out.println(i);
        }
    
    }


}
