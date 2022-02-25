package com.danielfan.module1._4;


public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3; //assume side 3 is the bottom side

    public Triangle(double width, double height, Colour colour){
        super(width, height);
        this.colour = colour;
    }
    public Triangle(double side1, double side2, double side3, Colour colour){
        super(colour);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.width = side3; // assuming side 3 is bottom side(width)
        this.height = heronsHeight();
    }

    /**
     * Uses Heron's formula to calculate height of triangle from 3 sides, if the height does not already exist.
     * @return double: the height of the triangle, directly or via Heron's Formula
     */
    private double heronsHeight(){
        if(height != 0){
            return height;
        } else{
            double s = (side1+side2+side3)/2;
            return 2*(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)))/width;
        }
    }

    /**
     * Same as above function, but public in order to run the test
     */
    public double heronsHeightTest(){
        if(height != 0){
            return height;
        } else{
            double s = (side1+side2+side3)/2;
            return 2*(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)))/width;
        }
    }
    /**
     * Returns the area of the Triangle from the width and height
     * @return double: the area calculated as absolute value of width*height/2
     */
    public double getArea(){
        return Math.abs((width*height)/2);
    }

    public String toString() {
        return "Type: Triangle" + " width=" + width + " height=" + height + " colour=" + colour;
    }

    public void rotate90() {

    }

    public void rotate180() {

    }

    public void rotate(double degree) {

    }

}
