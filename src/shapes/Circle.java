package shapes;

import java.awt.geom.Ellipse2D;

public class Circle extends Shape {
    
    private int d;  // diameter
    private Ellipse2D.Double circle;
    
    public Circle(int x, int y, int d) {
        super(x, y);
        this.setDiameter(d);
        this.createCircle();
    }   

    private void createCircle() {
        circle = new Ellipse2D.Double(super.getX(), super.getY(), this.d, this.d);
    }
    
    public Ellipse2D getShape() {
        return this.circle;
    }
    
    public void setDiameter(int d) {
        this.d = d;
    }
    
    public int getDiameter() {
        return this.d;
    }
    
}
