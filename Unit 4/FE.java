import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class FE extends Frame {

    FE()
    {

       add(new Button("Drop me!").addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Dropped!");
        }
       }));
    setVisible(true);

    }

    public static void main(String args[]) {
        FE obj = new FE();
    }
}
