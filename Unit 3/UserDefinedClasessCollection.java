import java.util.*;

class Student
{
    private int rollno;
    private String name;

    Student(int rn, String n)
    {
        rollno = rn;
        name = n;
    }

    public String display()
    {
        return name + " " + Integer.toString(rollno);
    }
}

public class UserDefinedClasessCollection {
    
    public static void main(String[] args) {
        
        LinkedList<Student> obj = new LinkedList<Student>();
    
        obj.add(new Student(100, "Vedhanth"));
        obj.add(new Student(200, "Joker"));


        for (Student n : obj)
        {
            System.out.println(n.display());
        }
    }


}
