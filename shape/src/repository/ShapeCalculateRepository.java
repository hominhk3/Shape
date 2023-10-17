package repository;

import data_access.ShapeCalculateDao;
import model.*;

public class ShapeCalculateRepository implements IShapeCalculateRepository {

    @Override
    public void Rectangle(Rectangle rectangle) {
        ShapeCalculateDao.Instance().Rectangle(rectangle);
    }

    @Override
    public void Circle(Circle circle) {
        ShapeCalculateDao.Instance().Circle(circle);
    }

    @Override
    public void Triangle(Triangle triangle) {
        if (!ShapeCalculateDao.Instance().Triangle(triangle)) {
            System.out.println("There are no such triangle");
        }
    }
}