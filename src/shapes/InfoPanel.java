package shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;

import java.util.ArrayList;

import javax.swing.JPanel;

public class InfoPanel extends JPanel {
    
    private ArrayList<Shape> s;
    
    public InfoPanel(ArrayList<Shape> r) {
        s = r;
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        String className;
        String text;
        int linebreak = 0;
        
        for (int i = 0; i < s.size() ; i++ ) {
            
            linebreak += 15;
            className = s.get(i).getClass().getName();
            text = "Object " + i + " is a: " + className.substring(className.lastIndexOf(".")+1, className.length());
            g.drawString(text, 10, linebreak);
            //System.out.println(s.get(i).getClass().getName());
        }
        
    }
}
