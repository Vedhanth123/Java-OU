import java.util.*;

import javax.xml.transform.SourceLocator;

class UserDefinedComparator implements Comparator<String> {
    
    public int compare(String a, String b)
    {
        String astr = a;
        String bstr = b;

        // This line reverses the comparator which helps in returning descending order Tree
        return bstr.compareTo(astr);
    }

}

public class ComparatorImplementation
{

    public static void main(String[] args) {
        
        // creating a TreeMap
        TreeSet<String> obj = new TreeSet<String>(new UserDefinedComparator());
    
    
        obj.add("A");
        obj.add("F");
        obj.add("C");
        obj.add("J");

        for(String s : obj)
        {
            System.out.println(s);
        }
    }

}


