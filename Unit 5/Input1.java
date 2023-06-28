import java.io.*;

public class Input1 {

    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // char c = '0';
        // do
        // {
        // try
        // {
        // c = (char) br.read();
        // System.out.println(c);
        // }
        // catch (IOException e)
        // {
        // System.out.println(e.getMessage());
        // }
        // }while(c != '0');

        String str = "";

        do {
            try {
                str = br.readLine();
                System.out.println(str);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } while (str.equals(""));
    }
}
