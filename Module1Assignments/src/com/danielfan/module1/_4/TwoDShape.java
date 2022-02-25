package com.danielfan.module1._4;

public abstract class TwoDShape {
    double width;
    double height;
    Colour colour;

    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(Colour colour){
        this.colour = colour;
    }

    public abstract double getArea();

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

}
