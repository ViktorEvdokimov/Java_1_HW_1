public class Main {

    public static void main(String[] args) {
        byte t11 = 0;
        short t12 = 0;
        int t13 = 0;
        long t14 = 0l;
        float t15 = 0f;
        double t16 = 0;
        boolean t17 = true;
        char t18 = '0';
        String t19 = "null";
        double a = 10;
        double b = 1.17;
        double c = 40;
        double d = 34;
        double result;
        result = calculationForTaskTwo(a, b, c, d);
        System.out.println(result);
    }


    static double calculationForTaskTwo(double a, double b, double c, double d) {
        if (d == 0) {
            System.out.println("Неверно введены данные, деление на 0");
            return 0;
        }
        double result = a * (b + (c / d));
        return result;
    }
}