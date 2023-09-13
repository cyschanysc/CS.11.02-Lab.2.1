import java.lang.Object;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) {
        int result1 = add(3, 8);
        System.out.println("Result of add method: " + result1);

        int result2 = add(3, 8, 4, 9);
        System.out.println("Result of add method with four integers: " + result2);

        String morningGreetingResult = morningGreeting("Toby Fox");
        System.out.println(morningGreetingResult);

        String afternoonGreetingResult = afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreetingResult);

        String tripleResult = triple("oohbaby");
        System.out.println(tripleResult);

        double halfResult1 = half(8);
        System.out.println("Result of half method (8): " + halfResult1);

        double halfResult2 = half(17);
        System.out.println("Result of half method (17): " + halfResult2);

        int roundPositiveResult1 = roundPositiveValueToNearestInteger(8.5);
        System.out.println("Result of roundPositiveValueToNearestInteger method (8.5): " + roundPositiveResult1);

        int roundPositiveResult2 = roundPositiveValueToNearestInteger(8.49);
        System.out.println("Result of roundPositiveValueToNearestInteger method (8.49): " + roundPositiveResult2);

        int roundNegativeResult1 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println("Result of roundNegativeValueToNearestInteger method (-8.5): " + roundNegativeResult1);

        int roundNegativeResult2 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println("Result of roundNegativeValueToNearestInteger method (-8.49): " + roundNegativeResult2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c, int d) {
        return add(add(a, b), add(c, d));
    }

    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    public static String triple(String text) {
        return text + text + text;
    }

    public static double half(int number) {
        return number / 2.0;
    }

    public static int roundPositiveValueToNearestInteger(double number) {
        return (int) Math.round(number);
    }

    public static int roundNegativeValueToNearestInteger(double number) {
        if (number >= 0) {
            return (int) Math.floor(number + 0.5);
        } else {
            return (int) Math.ceil(number - 0.5);
        }
    }
}