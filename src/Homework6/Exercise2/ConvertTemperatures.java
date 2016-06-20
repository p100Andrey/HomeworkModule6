package Homework6.Exercise2;

public class ConvertTemperatures {

    public static double fahrenheitToCelsius(double tF) {
        double constC1 = 5;
        double constC2 = 9;
        double constC = constC1 / constC2;
        int constCF = 32;
        return constC * (tF - constCF);
    }

    public static double celsiusToFahrenheit(double tC) {
        double constF1 = 9;
        double constF2 = 5;
        double concstF = constF1 / constF2;
        int constFC = 32;
        return concstF * tC + constFC;
    }
}
