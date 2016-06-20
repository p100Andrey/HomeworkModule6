package Homework6.Exercise3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите координаты точек: ");
                System.out.println("х1: ");
                int x1 = scanner.nextInt();
                System.out.println("х2: ");
                int x2 = scanner.nextInt();
                System.out.println("y1: ");
                int y1 = scanner.nextInt();
                System.out.println("y2: ");
                int y2 = scanner.nextInt();

                double distance = CalculatingDistance.calculatingDistance(x1, x2, y1, y2);
                System.out.println("Растояние между двумя точками," +
                        " представленными координатами" +
                        " в двумерном пространстве равно: " + distance);
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Знвчение должно быть числом");
                scanner.next();
            }
        }
    }
}
