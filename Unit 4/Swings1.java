import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Swings1 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("Introduction to JFrame");

        jf.setSize(400, 400);
        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("Swings are improvised GUI compared to AWT");

        JButton a = new JButton("click");

        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked");
            }
        });

        a.setSize(0, 0);
        jf.add(a);
    }
}
