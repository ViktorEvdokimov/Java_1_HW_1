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
        int t21 = 15;
        int t22 = 2;
        boolean ans = checkRange(t21, t22);
        System.out.println(ans);
        System.out.println( isPositive(15));
        System.out.println( isNegative(-15));
    }


    static double calculationForTaskTwo(double a, double b, double c, double d) {
        if (d == 0) {
            System.out.println("Неверно введены данные, деление на 0");
            return 0;
        }
        double result = a * (b + (c / d));
        return result;
    }

    static boolean checkRange (int a, int b){
        int c = a+b;
        return c<=20 && c>=10;
    }

    static String isPositive (int a){
        if (a<0){
            return "Negative";
        }
        return "Positive";
    }
    static boolean isNegative(int a){
        return a<0; //0 считаем положительным как в 5 задании, в 6м не оговорено
    }
}