package data_access;

import common.Validation;
import model.*;

public class ShapeCalculateDao {

    private static ShapeCalculateDao instance = null;
    Validation valid = new Validation();

    public static ShapeCalculateDao Instance() {
        if (instance == null) {
            synchronized (ShapeCalculateDao.class) {
                if (instance == null) {
                    instance = new ShapeCalculateDao();
                }
            }
        }
        return instance;
    }

    public void Rectangle(Rectangle rectangle) {
        rectangle.setWidth(valid.inputDouble("Please input side width of Rectangle"));
        rectangle.setLength(valid.inputDouble("Please input length of Rectangle"));
        rectangle.setArea(rectangle.getWidth() * rectangle.getLength());
        rectangle.setPerimeter((rectangle.getWidth() + rectangle.getLength()) * 2);
        System.out.println(rectangle.printResult());
    }

    public void Circle(Circle circle) {
        circle.setRadius(valid.inputDouble("Please input radius of Circle"));
        circle.setPerimeter(circle.getRadius() * 2 * Math.PI);
        circle.setArea(Math.pow(circle.getRadius(), 2) * Math.PI);
        System.out.println(circle.printResult());
    }

    public boolean Triangle(Triangle triangle) {
        triangle.setA(valid.inputDouble("Please input side A of Triangle"));
        triangle.setB(valid.inputDouble("Please input side B of Triangle"));
        triangle.setC(valid.inputDouble("Please input side C of Triangle"));
        if (!valid.checkTriangle(triangle)) {
            return false;
        }
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        double p = a + b + c;
        triangle.setPerimeter(p);
        p = p / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        triangle.setArea(s);
        System.out.println(triangle.printResult());
        return true;
    }
}