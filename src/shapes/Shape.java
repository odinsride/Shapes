package shapes;

import java.awt.geom.RectangularShape;

public class Shape {
    
    private int x;
    private int y;
    
    public Shape(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setShape() {

    }
    public RectangularShape getShape() {
        return null;
    }

    // draw
    
    // erase 

    // move
    
    //getColor
    
    //setColor
    
}
