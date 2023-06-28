import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class WP {
    public static void main(String[] args) {
        Frame fr = new Frame("Test");


        Checkbox cb1 = new Checkbox("Lavanya");
        cb1.setBounds(100, 100, 50, 50);
        Checkbox cb2 = new Checkbox("Joker");
        cb2.setBounds(100, 100, 50, 50);


        fr.add(cb1);
        fr.add(cb2);

        fr.setVisible(true);
        fr.setSize(400,400);
        fr.setLocation(300,300);

        cb1.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Lavanya");
            }
        });
        cb2.addItemListener(new ItemListener()
        {
            
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Joker");
            }
        });

    }
}
