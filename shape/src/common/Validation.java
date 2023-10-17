package common;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Triangle;

public class Validation {

    public double inputDouble(String title) {
        double a = 0;
        while (a < 1) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print(title + ": ");
                a = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Enter digit(a>0)");
                a = -1;
            }
        }
        return a;
    }

    public boolean checkTriangle(Triangle triangle) {
        if (triangle.getB() + triangle.getC() < triangle.getA()) {
            return false;
        }
        if (triangle.getA() + triangle.getC() < triangle.getB()) {
            return false;
        }
        return triangle.getA() + triangle.getB() >= triangle.getC();
    }
}