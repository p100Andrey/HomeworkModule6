package Homework6.Exercise1;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Радиус должен быть положтельным числом больше 0");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        double area = Math.PI * (Math.pow(radius, 2));
        return area;
    }
}
