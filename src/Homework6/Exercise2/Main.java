package Homework6.Exercise2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите значение температуры в цельсиях: ");
                double celsius = scanner.nextDouble();
                double fahrenheitResult = ConvertTemperatures.celsiusToFahrenheit(celsius);

                System.out.println(celsius + "C = " + fahrenheitResult + "F");
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Значение должно быть число");
                scanner.next();
            }
        }
        while (true) {
            try {
                System.out.println("Введите значение температуры в фаренгейтах: ");
                double fahrenheit = scanner.nextDouble();
                double celsiusResult = ConvertTemperatures.fahrenheitToCelsius(fahrenheit);

                System.out.println(fahrenheit + "F = " + celsiusResult + "C");
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Значение должно быть число");
                scanner.next();
            }
        }
    }
}
