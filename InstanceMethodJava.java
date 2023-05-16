// Write a Java program to create instance method wihout arguments and with return values
public class InstanceMethodJava {

    // Creating an Instance Method
    // Instance Methods are the methods/functions which are created in a class
    public String print()
    {
      return "Instance Method";
    }
  
    // Main function in java
    public static void main(String[] args) {
    
      // Creating an object
      InstanceMethodJava obj = new InstanceMethodJava();
      
      // Calling the function written in class and storing it in a variablee
      String output = obj.print();
      
      // Printing the output
      System.out.println(output);
      
    }
}
