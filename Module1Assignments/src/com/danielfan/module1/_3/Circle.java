package com.danielfan.module1._3;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }

    public double getArea() {
        return PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Type: Circle, Radius=" + radius;
    }
}
