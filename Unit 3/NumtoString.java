import java.lang.*;
import java.io.*;

public class NumtoString {
    
    
    // ------------------------------------------------------------------------------
    // 1) Take input from the user
    // 2) convert the given number to string using toString, toOctalString, toBinaryString, toHexString() methods
    public static void toStringPractice()
    {
        int num = 123;
        System.out.println(Integer.toString(num));   
        System.out.println(Integer.toBinaryString(num));   
        System.out.println(Integer.toOctalString(num));   
        System.out.println(Integer.toHexString(num));   
        
    }
    
    // 1) take input from the user
    // 2) convert the given string to its requried format using parseInt, parseFloat etc
    public static void parsePractice() throws IOException, NumberFormatException
    {
                
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            System.out.println("Enter you string: ");
            String str = br.readLine();
            int number2 = 100;
            
            try
            {
                // int num = Integer.parseInt(str);
                float fn = Float.parseFloat(str);
                double dn = Double.parseDouble(str);
                // number2 += num;
                // System.out.println(number2);
                System.out.println(fn);
                System.out.println(dn);

            }
            catch(NumberFormatException e)
            {
                System.out.println(e.getMessage());
            }
        }
        catch (IOException e)
        {
            System.out.println("IO exception");
        }
    }

    public static void main(String[] args) throws IOException, NumberFormatException{
        toStringPractice();
        parsePractice();
    }
}
