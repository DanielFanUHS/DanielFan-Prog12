package com.danielfan.module1._3;

public abstract class TwoDShape {
    double width;
    double height;

    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){

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
