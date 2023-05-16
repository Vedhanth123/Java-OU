// Write a java program to iterate over an array in java using for loop
import java.io.*;

// creating a class in java
public class Iterate_over_Array {
  
    // main function
    public static void main(String[] args) {
      
        // creating a 1 dimensional array
        int[] array = {1,2,3,4,5};
        
        // iterating over an array
        // Note: array class has .length attribute which returns the length of the array
        for(int i = 0; i < array.length; i ++)
        {
            // printing the value at each index of the array
            System.out.println(array[i]);
        }
    }
}
