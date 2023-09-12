public class Main {

    public static void main(String[] args) {
        int sum = add(3,8);
        System.out.println(sum);

        int total = add(3, 8, 4, 9);
        System.out.println(total);

        String morningMessage = morningGreeting("Toby Fox");
        System.out.println(morningMessage);

        String afternoonMessage = afternoonGreeting("Mac Miller");
        System.out.println(afternoonMessage);

        String tripledText = triple("oohbaby");
        System.out.println(tripledText);

        double halfValue1 = half(8);
        System.out.println(halfValue1);

        double halfValue2 = half(17);
        System.out.println(halfValue2);

        int roundedPositive1 = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedPositive1);

        int roundedPositive2 = roundPositiveValueToNearestInteger(8.49);
        System.out.println(roundedPositive2);

        int roundedNegative1 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundedNegative1);

        int roundedNegative2 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundedNegative2);
    }
    public static int add(int a, int b) {
            return a + b;
        }

        public static int add(int a, int b, int c, int d) {
            return add(a, b) + add(c, d);
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
            return (int) Math.round(number);
        }
    }
