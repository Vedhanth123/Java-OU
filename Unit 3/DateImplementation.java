import java.util.*;

public class DateImplementation {
    
    public static void main(String[] args) {
        Date obj = new Date();

        // Whenever the object is called it is automatically converted to string.
        System.out.println(obj);
        
        System.out.println(obj.getTime());
    }
}
