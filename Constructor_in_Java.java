// Write a Java program to demonstrate Constructor in java
import java.io.*;

public class Constructor_in_Java {
  
    // creating an instance variable in java
    // Instance variables are variables which are created in a class
    // which are accessible to each and every object 
    int age;
  
    // Creating a constructor
    Constructor_in_Java()
    {
        age = 18;
    }
    
    public static void main(String[] args) {
      
        // Constructor is called whenever the object is created.
        Constructor_in_Java obj = new Constructor_in_Java();
        
        System.out.println(obj.age);
    }
}
