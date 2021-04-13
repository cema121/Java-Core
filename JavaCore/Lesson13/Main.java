package Lesson13;

import java.util.concurrent.*;

public class Main {
    public static final int CARS_COUNT = 4;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "ВАЖНОЕ ОБЪЯВЛЕНИЕ" + ANSI_RESET + " >>> Подготовка!!!");

        CyclicBarrier cb = new CyclicBarrier(CARS_COUNT, ()
                -> System.out.println(ANSI_YELLOW + "ВАЖНОЕ ОБЪЯВЛЕНИЕ" + ANSI_RESET + " >>> Гонка началась!!!"));
        CountDownLatch cdl = new CountDownLatch(CARS_COUNT);

        Race race = new Race(new Road(60), new Tunnel(), new Road(40), new Finish());
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb, cdl);
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(ANSI_YELLOW + "ВАЖНОЕ ОБЪЯВЛЕНИЕ" + ANSI_RESET + " >>> Гонка закончилась!!!");
    }
}