package shapes;

import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape {
    
    private int height;
    private int width;
    private Rectangle2D.Double rectangle;
    
    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.setHeight(height);
        this.setWidth(width);
        this.createRectangle();
    }   

    private void createRectangle() {
        rectangle = new Rectangle2D.Double(super.getX(), super.getY(), this.height, this.width);
    }
    
    public Rectangle2D getShape() {
        return this.rectangle;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setWidth (int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }
}
