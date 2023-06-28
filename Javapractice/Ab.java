abstract class Shape
{
    int a,b;
    abstract int printArea(int a, int b);
}

class Rectangle extends Shape
{
    int printArea(int a, int b)
    {
        return (a * b);
    }
}
class Circle extends Shape
{
    int printArea(int a, int b)
    {
        return a * b;
    }
}
class Triangle extends Shape
{
    int printArea(int a, int b)
    {
        return a * a;
    }
}
public class Ab {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        Circle obj2 = new Circle();
        Triangle obj3 = new Triangle()

        obj.printArea(2, 4);
        obj2.printArea(0, 0)
    }
        
}
