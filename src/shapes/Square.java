package shapes;

import java.awt.geom.Rectangle2D;

public class Square extends Shape {
    
    private int length;
    private Rectangle2D.Double rectangle;
    
    public Square(int x, int y, int length) {
        super(x, y);
        this.setLength(length);
        this.createSquare();
    }   

    private void createSquare() {
        rectangle = new Rectangle2D.Double(super.getX(), super.getY(), this.length, this.length);
    }
    
    public Rectangle2D getShape() {
        return this.rectangle;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getLength() {
        return this.length;
    }
}
