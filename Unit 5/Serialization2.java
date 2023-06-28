import java.io.*;

// create a class and implement serializable interface so that you can flag java that this class will be converted into byte format
class Student implements Serializable {

    int data;
    String name;

    Student(int d, String n) {
        data = d;
        name = n;
    }

    void print() {
        System.out.println(this.data + this.name);
    }
}

public class Serialization2 {

    public static void main(String[] args) {
        // using FileOutputStream and ObjectOutputStream
        try {
            
            Student obj = new Student(100, "Vedhanth");
            FileOutputStream fos = new FileOutputStream("Serialization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            fos.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream("Serialization.txt");
            while (fis.read() != '\0') {
                System.out.println(fis.read());
            }
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        }
    }
}