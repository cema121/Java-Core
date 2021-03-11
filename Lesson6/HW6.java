package Lesson6;

/*
2. Все животные могут бежать и плыть.
В качестве параметра каждому методу передается длина препятствия. ъ
Результатом выполнения действия будет печать в консоль.
(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м.;
плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.*/

import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Дизель");
        Cat cat3 = new Cat("Бэси");
        Dog dog1 = new Dog("Веспа");
        Dog dog2 = new Dog("Дружок");
        Dog dog3 = new Dog("Барбос");

        System.out.println("Введите дистанцию заплыва");
        Scanner sс = new Scanner(System.in);
        int sLength = sс.nextInt();

        System.out.println("Введите дистанцию бега");
        int rLength = sс.nextInt();

        dog2.swim(sLength);
        dog2.run(rLength);

        cat1.run(rLength);
        cat1.swim(sLength);

        cat2.run(rLength);
    }
}

