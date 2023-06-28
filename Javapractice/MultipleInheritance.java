
interface a
{
    void function1(int a, int b);

}

interface b
{
    void function2(float a, float b);
}


public class MultipleInheritance implements a,b{

    
    public void function1(int a, int b) {
        System.out.println(a + b);
        
    }
    public void function2(float a, float b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        
        MultipleInheritance obj = new MultipleInheritance();
        obj.function1(11110, 0);
        obj.function2(33330.0f, 303.6f);
    }
}
