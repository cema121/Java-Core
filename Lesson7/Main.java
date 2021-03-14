package Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cat_array = new Cat[5];
        cat_array[0] = new Cat("Barsik", 15);
        cat_array[1] = new Cat("Tuzik", 25);
        cat_array[2] = new Cat("Snezhok", 17);
        cat_array[3] = new Cat("Iriska", 15);
        cat_array[4] = new Cat("Obzhora", 50);

        Plate plate = new Plate(100);

        System.out.println("Врему кормить котов:\n");
        plate.info();
        for (int i = 0; i < cat_array.length; i++) {
            cat_array[i].eat(plate);
        }

        plate.increaseFood(30);
    }
}
