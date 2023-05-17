import java.util.*;


public class VectorImplementation {

    // using Vector class which is literally similar to ArrayList
    public static void main(String[] args) {
        
        Vector<Integer> obj = new Vector<Integer>(3,2);

        System.out.println(obj.capacity());

        obj.addElement(1);
        obj.addElement(2);
        obj.addElement(3);
        obj.addElement(4);
        obj.addElement(5);
        obj.addElement(6);

        System.out.println(obj.capacity());

        // Enumerating elements from the vector
        Enumeration vEnum = obj.elements();

        while(vEnum.hasMoreElements())
        {
            System.out.println(vEnum.nextElement());
        }

        // using iterator instead of Enumeration
        Iterator<Integer> vIter = obj.iterator();

        while(vIter.hasNext())
        {
            System.out.println(vIter.next());
        }
    }    
}
