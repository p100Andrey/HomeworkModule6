package Homework6.Exercise3;

public class CalculatingDistance {


    public static double calculatingDistance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }
}
