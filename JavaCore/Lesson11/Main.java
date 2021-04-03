package Lesson11;

import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    public static void exercise1() {
        System.out.println("\nЗадание 1");
        String[] array = {"Иванов", "Петров", "Сидоров"};
        System.out.println(Arrays.toString(array));
        move(array, 0, 2);
        System.out.println(Arrays.toString(array));
    }

    private static <T> void move(T[] array, int element1, int element2) {
        T temp = array[element1];
        array[element1] = array[element2];
        array[element2] = temp;
    }

    public static void exercise2() {
        System.out.println("\nЗадание 2");
        String[] array = new String[]{"Иванов", "Петров", "Сидоров"};
        List<String> list = toArrayList(array);
        System.out.println(list.getClass() + " : " + list);
    }

    private static <T> List<T> toArrayList(T[] array) {
        return Arrays.asList(array);
    }

    public static void exercise3() {
        System.out.println("\nЗадание 3");

        Box<Apple> box1 = new Box<>();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        Box<Apple> box2 = new Box<>();
        box2.add(new Apple());
        box2.add(new Apple());

        Box<Orange> box3 = new Box<>();
        box3.add(new Orange());
        box3.add(new Orange());

        System.out.println("Вес коробок 1 и 2 равен: " + box1.compare(box2));
        System.out.println("Вес коробок 1 и 3 равен: " + box1.compare(box3));

        System.out.println("Кол-во в коробке 1: " + box1.count() + "шт., в коробке 2: " + box2.count() + "шт.");
        box1.moveTo(box2);
        System.out.println("Кол-во в коробке 1: " + box1.count() + "шт., в коробке 2: " + box2.count() + "шт.");


    }

}