package com.danielfan.module1._4;

public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius, Colour colour){
        super(colour);
        this.radius = radius;
    }

    /**
     * Returns the area of this Circle object from the radius
     * @return double: the area calculated as (pi)r^2
     */
    public double getArea() {
        return PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Type: Circle, Radius=" + radius  + " colour=" + colour;
    }
}
