package com.danielfan.module1._4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(5, Colour.GREEN));
        shapeList.add(new Triangle(5, 7, Colour.BLUE));
        shapeList.add(new Triangle(5, 3 ,7, Colour.RED));
        shapeList.add(new Circle(20, Colour.NONE));

        for (TwoDShape shape :
                shapeList) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.getArea());
        }
    }
}
