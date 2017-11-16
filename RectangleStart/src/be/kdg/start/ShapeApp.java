package be.kdg.start;
import be.kdg.start.geometry.Rectangle;
import be.kdg.start.geometry.Shape;
import be.kdg.start.geometry.Square;
import be.kdg.start.geometry.Circle;

/**
 * @author Alexander Feyaerts
 * @version 1.0 16/11/2017 16:01
 */
public class ShapeApp {
    public static void main (String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(2);
        shapes[2] = new Rectangle(3,2);

        for(Shape shapeObj: shapes)
        {
            System.out.println(shapeObj);
        }
    }
}
