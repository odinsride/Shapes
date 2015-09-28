package shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ShapeExample extends JPanel {

    private Ellipse2D.Double circle
        = new Ellipse2D.Double(10,10,350,350);
    private Rectangle2D.Double square
        = new Rectangle2D.Double(10,10,350,350);

    public void paintComponent(Graphics g) {
        clear(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.draw(circle);
        //g2d.draw(square);
    }
    
    protected void clear(Graphics g) {
        super.paintComponent(g);
    }
    
    public static void main(String[] args) {
        WindowUtilities.openInJFrame(new ShapeExample(), 400, 400, "Shape");
    }

}
