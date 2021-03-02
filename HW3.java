package Lesson3;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        guessNumber();
        oneMoreTime();
    }

    public static void guessNumber() {
        int guessNum = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);

        System.out.println("Угадай число от 0 до 9\nНа это у Вас есть всего 3 попытки!");

        int step = 1, maxStep = 3;

        do {
            System.out.println("Введите число:");

            int number = sc.nextInt();
            System.out.println("Вы ввели число " + number);

            if (number == guessNum) {
                System.out.println("Ура, Вы угадали!");
                break;
            } else if (step == maxStep) {
                System.out.println("Вы проиграли!\nПравильный ответ " + guessNum);
                break;
            } else if (number > guessNum) {
                System.out.println("Вы ввели слишком большое число.\nУ вас осталось " + (maxStep - step) + " попыток.");
                step++;
            } else if (number < guessNum) {
                System.out.println("Вы ввели слишком маленькое число.\nУ вас осталось " + (maxStep - step) + " попыток.");
                step++;
            }
        }
         while (step <= maxStep);
    }

    public static void oneMoreTime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

        int oneMoreTime = sc.nextInt();
        if (oneMoreTime == 1) {
            guessNumber();
            oneMoreTime();
        } else {
            System.out.println("Игра окончена");
        }
    }
}
