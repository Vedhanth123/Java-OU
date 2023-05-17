import java.util.*;

public class StringTokenerzerImplementation {
    
    // String tokenizer class is used to parse string
    // This is similar to string split in strings

    public static String str = "Hello how are you doing and why are you here and what work are you doing here";
    public static void main(String[] args) {
     
        StringTokenizer obj = new StringTokenizer(str, " ");

        while(obj.hasMoreTokens())
        {
            System.out.println(obj.nextToken());
        }

    }
}
