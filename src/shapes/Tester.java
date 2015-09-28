package shapes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.geom.RectangularShape;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;


public class Tester extends JFrame {
    
    public static void main(String[] args) {
        new Tester();        
    }

    public Tester() {
        
        super("Tester Class - Drawing Shapes");

        Random generator = new Random();
        
        ArrayList<Shape> rArray = new ArrayList<Shape>();
        
        for (int i = 0; i < 5; i++) {
            
            int randX = generator.nextInt(200);
            int randY = generator.nextInt(200);
            int randDiameter = generator.nextInt(200);

            rArray.add(new Circle(randX, randY, randDiameter));
        }
        
        for (int i = 0; i < 5; i++) {
            
            int randX = generator.nextInt(200);
            int randY = generator.nextInt(200);
            int randHeight = generator.nextInt(200);
            int randWidth = generator.nextInt(200);

            rArray.add(new Rectangle(randX, randY, randHeight, randWidth));

        }
        
        for (int i = 0; i < 5; i++) {
            
            int randX = generator.nextInt(200);
            int randY = generator.nextInt(200);
            int randLength = generator.nextInt(300);
                       
            rArray.add(new Square(randX, randY, randLength));

        }
        
        WindowUtilities.setNativeLookAndFeel();
        addWindowListener(new ExitListener());
        Container content = getContentPane();
        content.setBackground(Color.lightGray);
        ShapesPanel drawArea = new ShapesPanel(rArray);
        InfoPanel infoArea = new InfoPanel(rArray);
        drawArea.setPreferredSize(new Dimension(400,400));
        infoArea.setPreferredSize(new Dimension(150,400));
        content.add(drawArea, BorderLayout.EAST);
        content.add(infoArea, BorderLayout.WEST);
        //WindowUtilities.openInJFrame(p1, 400, 400, "Shape", Color.WHITE);
        
        pack();
        setVisible(true);
        System.gc();
    }
    
}
