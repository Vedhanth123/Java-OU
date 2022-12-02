import java.io.*;

public class Array_to_Function {
    public void function1(int[] array) {
        for(int i = 0; i < array.length; i ++)
        {
            System.out.println("The first element is: " + array[i]);
        }
    }

    public static void main(String[] args) {
        
        // creating instance of class
        GFG obj = new GFG();

        // creating a 1D and a 2D array
        int[] oneDimensionalArray = { 1, 2, 3, 4, 5 };
        
        // passing the 1D array to function 1
        obj.function1(oneDimensionalArray);
    }
}
