package Homework6.Exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculateCircle(sc);
        calculateRectangle(sc);
        calculateTriangle(sc);
    }

    private static double getUserInput(Scanner sc, String message) {
        double input;
        while (true) {
            System.out.println(message);
            try {
                input = sc.nextDouble();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Значение должно быть числом");
                sc.next();
            }
        }
        return input;
    }

    private static void calculateCircle(Scanner sc) {
        while (true) {
            try {
                double radius = getUserInput(sc, "Введите радиус: ");

                Figure circle = new Circle(radius);
                System.out.println("Площадь круга равна: " + circle.area());
                break;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void calculateTriangle(Scanner sc) {
        while (true) {
            try {
                System.out.println("Введите стороны треугольника: ");
                double sideX = getUserInput(sc, "Сторона А: ");
                double sideY = getUserInput(sc, "Сторона B: ");
                double sideZ = getUserInput(sc, "Сторона С: ");

                Figure triangle = new Triangle(sideX, sideY, sideZ);
                System.out.println("Площадь треугольника равна: " + triangle.area());
                break;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void calculateRectangle(Scanner sc) {
        while (true) {
            try {
                System.out.println("Введите стороны прямоугольника: ");
                double sideA = getUserInput(sc, "Сторона А: ");
                double sideB = getUserInput(sc, "Сторона В: ");

                Figure rectangle = new Rectangle(sideA, sideB);
                System.out.println("Площадь прямоугольника равна: " + rectangle.area());
                break;
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
