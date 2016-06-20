package Homework6.Exercise1;

public class Triangle extends Figure {
    private double sideX, sideY, sideZ;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 | sideB <= 0 | sideC <= 0) {
            throw new IllegalArgumentException("Все стороны должны быть положительными числами и больше 0");
        }
        this.sideX = sideA;
        this.sideY = sideB;
        this.sideZ = sideC;
    }

    @Override
    public double area() {
        int two = 2;
        double halfP = (sideX + sideY + sideZ) / two;
        double area = Math.sqrt(halfP * (halfP - sideX) *
                (halfP - sideY) * (halfP - sideZ));
        return area;
    }
}

