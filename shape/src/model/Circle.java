package model;

public class Circle extends Shape {

    private double radius;
    private double perimeter;
    private double area;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String printResult() {
        return "Radius: " + this.getRadius()
                + "\nArea: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter();
    }
}