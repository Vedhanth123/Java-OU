import java.util.*;

public class CalendarImplementation {
    
    public static void main(String[] args) {
        // creating a calendar object by instantiating current date and time
        Calendar obj = Calendar.getInstance();

        // fetching all the details of the Calendar
        System.out.println(obj.get(Calendar.HOUR));
    }
}
