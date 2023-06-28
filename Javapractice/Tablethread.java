
class Table
{
    void print(int a)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*a);
        }
    }
}

class Mythread implements Runnable
{
    public void run()
    {
        Table t = new Table();
        t.print(5);
    }
}

public class Tablethread
{
    public static void main(String[] args)
    {
        Mythread t1 = new Mythread();
        Thread th1 = new Thread(t1);
        th1.start();    
    }
}
