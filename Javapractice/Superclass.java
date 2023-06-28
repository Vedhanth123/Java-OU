class Figure
{
    void area(int a, int b)
    {
        System.out.println(a * b);
    }
}

class Rectangle extends Figure
{
    void area(int a, int b)
    {
        System.out.println(a * b);
    }
}
class Triangle extends Figure
{
    void area(int a, int b)
    {
        System.out.println(0.5 * a * b);
    }
}
public class Superclass
{
    public static void main(String[] args) {
        
    }
}