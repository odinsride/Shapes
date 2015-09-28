package shapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;

import java.util.ArrayList;

import javax.swing.JPanel;


public class ShapesPanel extends JPanel {
    
    private static int technique = 0;
    
    private ArrayList<Shape> s;
    private Graphics2D g2d;
    
    public ShapesPanel(ArrayList<Shape> r, String technique) {
        s = r;
        setTechnique(technique);
    }
    
    public ShapesPanel(ArrayList<Shape> r) {
        s = r;
    }
    
    public void paintComponent(Graphics g) {
        //clear(g);
        g2d = (Graphics2D)g;
        
        for (int i = 0; i < s.size() ; i++ ) {
            switch(technique) {
                case 0:      g2d.draw(s.get(i).getShape());
                             break;
                case 1:      g2d.fill(s.get(i).getShape());
                             break;
                default:     g2d.draw(s.get(i).getShape());
                             break;
            }
            g2d.drawString(Integer.toString(i), (int)s.get(i).getX(), (int)s.get(i).getY());
        }
        
    }
    
    protected void clear(Graphics g) {
        super.paintComponent(g);
    }
    
    private void setTechnique(String technique) {
        if (technique == "Draw")
            this.technique = 0;
        else if (technique == "Fill")
            this.technique = 1;
        else
            this.technique = 0;
    }
    
    private int getTechnique() {
        return this.technique;
    }
}
