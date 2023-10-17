package model;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double area;
    private double perimeter;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
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
        return "Side A: " + this.getA()
                + "\nSide B: " + this.getB()
                + "\nSide C: " + this.getC()
                + "\nArea: " + this.getArea()
                + "\nPerimeter: " + this.getPerimeter();
    }
}