package Homework6.Exercise4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите значения массива(разме, нижняи граница, верхняя граница): ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int[] array = ArrayUtils.createArray(a, b, c);

                ArrayUtils.printArray(array);

                System.out.println("Max: " + ArrayUtils.maximum(array));
                System.out.println("Min: " + ArrayUtils.minimum(array));

                System.out.println("Sorting...");
                ArrayUtils.sortArray(array);
                ArrayUtils.printArray(array);
                break;

            } catch (InputMismatchException ex) {
                System.out.println("Значение должно быть числом");
                sc.next();
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
