package model;

public class Rectangle extends Shape {

    private double width;
    private double length;
    private double area;
    private double perimeter;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String printResult() {
        return "Width: " + this.getWidth()
                + "\nLength: " + this.getLength()
                + "\nArea: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter();
    }
}