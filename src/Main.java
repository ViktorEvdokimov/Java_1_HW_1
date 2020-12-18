public class Main {

    public static void main(String[] args) { // task 1
        // task 2 start
        byte t11 = 0;
        short t12 = 0;
        int t13 = 0;
        long t14 = 0l;
        float t15 = 0f;високосный
        double t16 = 0;
        boolean t17 = true;
        char t18 = '0';
        String t19 = "null";
        // task 2 end
        float a = 10f;
        float b = 1.17f;
        float c = 40f;
        float d = 34f;
        float result;
        result = calculationForTaskTwo(a, b, c, d);
        System.out.println(result);
        int t21 = 15;
        int t22 = 2;
        boolean ans = checkRange(t21, t22);
        System.out.println(ans);
        System.out.println( isPositive(15));
        System.out.println( isNegative(-15));
        sayHello("Vlad");
        System.out.println("leap = " + leapYear(2100));
    }


    static float calculationForTaskTwo(float a, float b, float c, float d) { //task 3
        if (d == 0) {
            System.out.println("Неверно введены данные, деление на 0");
            return 0;
        }
        float result = a * (b + (c / d));
        return result;
    }

    static boolean checkRange (int a, int b){ //task 4
        int c = a+b;
        return c<=20 && c>=10;
    }

    static String isPositive (int a){ // task 5
        if (a<0){
            return "Negative";
        }
        return "Positive";
    }
    static boolean isNegative(int a){ // task 6
        return a<0; //0 считаем положительным как в 5 задании, в 6м не оговорено
    }
    static void sayHello (String a){ // task 7
        System.out.println("Привет, " + a);
    }
    static boolean leapYear (int year){ //task 8
        return year%4==0 && year%100!=0 || year%400==0;
    }
}