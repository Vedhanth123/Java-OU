import java.util.*;

public class ArrayImplementation {

    public static void display(int array[])
    {
        for(int i : array)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        
        // Create an array 
        int arr[] = new int[10];

        Arrays.fill(arr, 200);

        display(arr);

        Arrays.fill(arr,2,9,-10);

        Arrays.sort(arr);

        display(arr);

    }

}
