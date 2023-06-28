class Parent
{
    void overriding(int a, int b)
    {
        System.out.println(a + b);
    }
}
public class Overriding extends Parent {
    
    void overriding(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }

    void overloading(float a, float b)
    {
        System.out.println(a + b);
    }

    void overloading(float a, float b, float c)
    {
        System.out.println(a + b + c);   
    }
    public static void main(String[] args) {
        
        Overriding obj = new Overriding() {
            
        };
        overriding(10, 20);

    }
}
