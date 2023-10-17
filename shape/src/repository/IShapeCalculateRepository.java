package repository;

import model.Circle;
import model.Rectangle;
import model.Triangle;

public interface IShapeCalculateRepository {

    void Circle(Circle circle);

    void Rectangle(Rectangle rectangle);

    void Triangle(Triangle triangle);

}