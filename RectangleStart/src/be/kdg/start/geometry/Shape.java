package be.kdg.start.geometry;

/**
 * @author Alexander Feyaerts
 * @version 1.0 16/11/2017 14:35
 */
public abstract class Shape {

    private int x;
    private int y;

    public Shape()
    {

    }

    public Shape(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract int getPerimeter();

    public abstract int getArea();

    public void setPosition(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

}