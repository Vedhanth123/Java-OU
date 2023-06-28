import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Swings2 {
    
    public static void main(String[] args) {
        
        JFrame obj = new JFrame("test");
        JButton jb = new JButton("Name");

        obj.add(jb);
        obj.setVisible(true);
    }
}
