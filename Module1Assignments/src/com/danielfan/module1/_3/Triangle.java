package com.danielfan.module1._3;


public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3; //assume side 3 is the bottom side

    public Triangle(double width, double height){
        super(width, height);
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.width = side3; // assuming side 3 is bottom side(width)
        this.height = heronsHeight();
    }

    private double heronsHeight(){
        if(height != 0){
            return height;
        } else{
            double s = (side1+side2+side3)/2;
            return 2*(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)))/width;
        }
    }

    public double getArea(){
        return Math.abs((width*height)/2);
    }

    public String toString() {
        return "Type: Triangle" + " width=" + width + " height=" + height;
    }

    public void rotate90() {

    }

    public void rotate180() {

    }

    public void rotate(double degree) {

    }
}
