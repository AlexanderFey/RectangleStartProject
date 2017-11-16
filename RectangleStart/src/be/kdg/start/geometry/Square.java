package be.kdg.start.geometry;

/**
 * @author Alexander Feyaerts
 * @version 1.0 14/11/2017 15:00
 */
public class Square extends Rectangle{

    public String description = "Square";

    public Square(){
       this(1);
    }

    public Square(int side){
        this(side,1,1);
    }

    public Square(int side, int x, int y){
        super(x,y,side,side);
    }


    public void setSize(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public void setHeight(int height) {
       super.setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
    }
}
