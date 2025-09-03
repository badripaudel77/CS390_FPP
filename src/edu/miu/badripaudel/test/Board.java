package edu.miu.badripaudel.test;

public class Board {
    private double height;
    private double width;
    private String color;

    public Board() {
       height = 56.0;
       width = 66.0;
       color = "UNKNOWN";
    }

    public Board(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public double area() {
        return height * width;
    }

    public double perimeter() {
         double p = 2* (height + width);
         return p;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Board{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }

}
