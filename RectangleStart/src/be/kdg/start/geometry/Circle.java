package be.kdg.start.geometry;


/**
 * @author Alexander Feyaerts
 * @version 1.0 16/11/2017 14:36
 */
public class Circle extends Shape{
    private int radius;


    public Circle(int radius)
    {
        this(radius,1,1);
    }

    public Circle(int radius, int x,int y)
    {
        super(x,y);
        this.radius  = radius;
    }


    @Override
    public int getPerimeter() {
        double omtrek = (2*getRadius()*Math.PI);
        return (int)omtrek;
    }

    @Override
    public int getArea() {
        double oppervlakte = (getRadius()*getRadius() * Math.PI);
        return (int)oppervlakte;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Circle at: (%d,%d) Radius: %d, Area: %d, Perimeter: %d",getX(),getY(),getRadius(),getArea(),getPerimeter());
    }
}
