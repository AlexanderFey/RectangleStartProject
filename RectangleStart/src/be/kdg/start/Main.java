package be.kdg.start;

import be.kdg.start.geometry.Rectangle;
import be.kdg.start.geometry.Square;
import be.kdg.start.geometry.Circle;


public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 1, 10, 20);
        rect.grow(5);
        System.out.println(rect.toString());
        System.out.printf("Area: %-5dPerimeter: %-5d%n", rect.getArea(), rect.getPerimeter());

        //opdracht 1
        Square square = new Square();
        square.setPosition(2,1);
        System.out.println(square.toString());


        //Opdracht 2
        System.out.println();
        Rectangle rectangle = new Rectangle();
        System.out.println("out van opdracht 2");
        System.out.println("Description: " + rectangle.description);
        System.out.println("Description: " + square.description);

        //opdracht 3
        System.out.println();
        System.out.println();
        System.out.println("Out van opdracht 3");
        Square square3 = new Square();
        square3.setSize(3);
        System.out.printf("w: %d - h: %d%n", square3.getWidth(), square3.getHeight());
        square.setWidth(4);
        System.out.printf("w: %d - h: %d%n", square3.getWidth(), square3.getHeight());
        square.setHeight(5);
        System.out.printf("w: %d - h: %d%n", square3.getWidth(), square3.getHeight());

        square3.setPosition(2,3);


        //opdracht 4
        System.out.println();
        System.out.println();
        System.out.println("Opdracht 4");
        Square s1 = new Square();
        Square s2 = new Square(4);
        Square s3 = new Square(5, 10, 10);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        //opdracht 6
        System.out.println();
        System.out.println();
        System.out.println("opdracht 6");
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(2,3, 4, 5);
        Square s = new Square(10);
        System.out.println(c);
        System.out.println(r);
        System.out.println(s);

    }
}