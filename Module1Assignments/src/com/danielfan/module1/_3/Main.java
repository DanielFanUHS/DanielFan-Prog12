package com.danielfan.module1._3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(5));
        shapeList.add(new Triangle(5, 7));
        shapeList.add(new Triangle(5, 3 ,7));
        shapeList.add(new Circle(20));

        for (TwoDShape shape :
                shapeList) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.getArea());
        }
    }
}
