import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The program calculates the area under the graph of a function");

        double[] coefficients = getCoefficients();
        printFunction(coefficients);

        System.out.println("Specify the beginning and end of the interval");
        double startInterval = scanner.nextDouble();
        double endInterval = scanner.nextDouble();
        System.out.println("Enter the number of intervals (the larger the interval, the greater the accuracy, but the time is longer");
        int numberIntervals = scanner.nextInt();
        double area = calculateFunctionArea(coefficients,startInterval, endInterval, numberIntervals);
        System.out.printf("The area under the graph of the function is %.3f\n ", area);
    }

    public static double calculateFunctionArea(double[] coefficients, double startInterval, double endInterval, int numberIntervals) { 
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
        System.out.println("Enter the degree of the polynomial");
        int degree = scanner.nextInt(); // stopien

        double[] coefficients = new double[degree + 1];
        System.out.println("Enter the coefficients of the polynomial in quantity " + (degree + 1));
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
