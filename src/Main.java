import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program liczy pole pod wykresem funkcji");

        double[] coefficients = getCoefficients();
        printFunction(coefficients);

        System.out.println("Podaj początek i koniec przedziału");
        double startInterval = scanner.nextDouble();
        double endInterval = scanner.nextDouble();
        System.out.println("Podaj liczbę przedziałów (im większa to dokładność jest większa, lecz czas" +
                " się przedłuża)");
        int numberIntervals = scanner.nextInt();
        double area = calculateFunctionArea(coefficients,startInterval, endInterval, numberIntervals);
        System.out.printf("Pole pod wykresem funkcji wynosi %.3f\n ", area);
    }

    public static double calculateFunctionArea(double[] coefficients, double startInterval, double endInterval, int numberIntervals) { // start przedzialu
        double area = 0;
        double interval = (endInterval - startInterval) / numberIntervals;
        // f(x) = x^2 - 3x + 2
        for (int i = 0; i < numberIntervals; i++) {
            double temp = startInterval + i * interval;
            area += getValueFunction(coefficients, temp);
//            area += abs(pow(temp, 2) - 3 * temp + 2);
//            area += abs(temp + 1);
        }
        return (interval / 2) * (getValueFunction(coefficients, startInterval) +
                getValueFunction(coefficients, endInterval) + 2 * area);
//        return (interval / 2) * (abs(pow(startInterval, 2) - 3 * startInterval + 2) +
//                abs(pow(endInterval, 2) - 3 * endInterval + 2) + 2 * area);
//        return (interval / 2) * (abs(startInterval + 1) + abs(endInterval + 1) + 2 * area);
    }

    public static double[] getCoefficients() {
        System.out.println("Podaj stopień wielomianu");
        int degree = scanner.nextInt(); // stopien

        double[] coefficients = new double[degree + 1];
        System.out.println("Podaj współczynniki wielomianu w ilości " + (degree + 1));
        for(int i = 0 ; i <= degree; i++){
            coefficients[i] = scanner.nextDouble();
        }
        return coefficients;
    }

    public static double getValueFunction(double[] coefficients, double valueX){
        int size = coefficients.length;
        double valueY = 0;
        for(int i = 0 ; i < size; i++){
            valueY += coefficients[i] * pow(valueX, size - 1 - i);
        }
        return abs(valueY);

    }
    public static void printFunction(double[] coefficients){
        int size = coefficients.length;
        String function = "f(x) = ";
        for(int i = 0; i < size; i++){
            function += coefficients[i] + "x^" + (size - 1 - i) + " + ";
        }
        System.out.println(function);
    }
}