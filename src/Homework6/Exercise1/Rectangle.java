package Homework6.Exercise1;

public class Rectangle extends Figure {
    private double sideA, sideB;

    public Rectangle(double sideA, double sideB) {
        if (sideA <=0 | sideB <=0) {
            throw new IllegalArgumentException("Все стороны должны быть положительными числами и больше 0");
        }
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        double area = sideA * sideB;
        return area;
    }
}
