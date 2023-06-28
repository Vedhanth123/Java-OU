import java.lang.*;
import java.awt.*;
import java.awt.event.*;


public class Button2
{
    public static void main(String[] args) {
        
        Frame fr = new Frame("Practice Java!");

        Button but = new Button("Click Me!");

        but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        but.setSize(100,50);
        but.setBackground(Color.BLACK);
        fr.add(but);
        fr.setSize(500,300);

        fr.setVisible(true);
    }
}

