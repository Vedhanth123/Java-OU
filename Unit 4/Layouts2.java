import java.awt.*;
import java.awt.event.*;

public class Layouts2 {
    
    public static void main(String[] args) {

        Frame cardFrame = new Frame("Test");
        
        CardLayout cl = new CardLayout(2,2);
        Panel pl = new Panel(cl);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();

        TextField tf = new TextField("Lavanya");
        TextField tf2 = new TextField("Joker");
        TextField tf3 = new TextField("WasteFellow");
        TextField tf4 = new TextField("Stupid");

        p1.add(tf);
        p2.add(tf2);
        p3.add(tf3);
        p4.add(tf4);

        pl.add(p1);
        pl.add(p2);
        pl.add(p3);
        pl.add(p4);

        Button bt = new Button("Next!");

        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                cl.next(pl);
            }
        });

        cardFrame.add(bt,"South");
        cardFrame.add(pl);

        cardFrame.setVisible(true);
    }   
}
