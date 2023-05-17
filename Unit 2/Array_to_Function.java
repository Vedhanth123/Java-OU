// Java program to send Array as a parameter to a function in Java
import java.io.*;

// creaing a class 
// Note: make sure to keep class name same as file name 
public class Array_to_Function {
    
    // creating a function in java class
    public void function1(int[] array) {
        for(int i = 0; i < array.length; i ++)
        {
            System.out.println("The first element is: " + array[i]);
        }
    }

    public static void main(String[] args) {
        
        // creating instance of class 
        // This is similar to creating a variable of a class
        GFG obj = new GFG();

        // creating a 1D and a 2D array
        int[] oneDimensionalArray = { 1, 2, 3, 4, 5 };
        
        // passing the 1D array to function 1
        obj.function1(oneDimensionalArray);
    }
}
