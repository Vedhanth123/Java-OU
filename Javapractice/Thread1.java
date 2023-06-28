
import java.lang.*;

class Mythread1 extends Thread
{
    public void run()
    {
        System.out.println("Running Thread!");
    }
}
public class Thread1 {
    public static void main(String[] args) {
        Mythread1 obj = new Mythread1();
        obj.start();
        
    }
}
