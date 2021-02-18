import java.util.Scanner;

public class JavaApp {

    public static void main(String[] args) {

       byte a = 120;
       short b = 255;
       int c = 7000;
       long d = 23145345;

       float e = 12.23f;
       double f = 123.123;
       char g = 'A';
       boolean h = true;

       System.out.println("Задание 3: " + calculate( 2, 3, 4, 5));
       System.out.println("Задание 4: " + task10and20(11, 8));
       isPositiveOrNegative(-1);
       System.out.println("Задание 6: " + isNegative(-1));
       greetings("");
       leapYear(2021);
    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int x1, int x2) {
        return ((x1 + x2) <= 20 && (x1 + x2) >= 10);
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Задание 5: Положительное");
        } else {
            System.out.println("Задание 5: Отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        return x < 0;
    }

    public static void greetings(String name) {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Задание 7: " + "Привет, " + name + "!");
    }

    public static void leapYear(int x) {
        if (((x % 4) == 0) && ((x % 100) != 0) || ((x % 400) == 0)) {
            System.out.println("Задание 8: " + x + " Високосный год");
        } else {
            System.out.println("Задание 8: " + x + " Не високосный год");
        }
    }
}

