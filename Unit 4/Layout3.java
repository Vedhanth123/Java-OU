import java.awt.*;
import java.awt.event.*;


public class Layout3 extends Frame{
    
    Layout3() {
        
        setSize(400,400);
        setVisible(true);
   
    }

    public void paint(Graphics g)
    {
        g.drawLine(3,3,200,200);
        g.drawRect(50, 80, 150, 80);
        // g.drawRect(MAXIMIZED_BOTH, ABORT, k3, 5);
        g.setColor(Color.RED);

    }
    public static void main(String[] args) {
        new Layout3();
        
    }
}
