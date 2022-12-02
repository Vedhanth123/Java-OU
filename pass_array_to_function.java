import java.io.*;

class GFG {
    void function1(int[] array) {
        System.out.println("The first element is: " + array[0]);
    }

    public static void main(String[] args) {
        
        // creating instance of class
        GFG obj = new GFG();

        // creating a 1D and a 2D array
        int[] oneDimensionalArray = { 1, 2, 3, 4, 5 };
        int[][] twoDimensionalArray = { { 10, 20, 30 },
                                        { 40, 50, 60 },
                                        { 70, 80, 90 } };
        
        // passing the 1D array to function 1
        obj.function1(oneDimensionalArray);
        
        // passing the 2D array to function 2
        obj.function2(twoDimensionalArray);
    }
}
