import java.util.*;


public class BitSetImplementation {
    public static void main(String[] args) {
        
        // Creating BitSet objects
        BitSet b1 = new BitSet(8);
        BitSet b2 = new BitSet(8);

        for(int i = 0; i < 8; i ++)
        {
            b1.set(i%2);
            b2.set(i%3);
        }

        System.out.println(b1);
        System.out.println(b2);

        b2.and(b1);
        System.out.println(b2);
    }

}
