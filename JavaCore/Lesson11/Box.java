package Lesson11;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> storage = new ArrayList<>();

    void add(T fruit) {
        storage.add(fruit);
    }

    Boolean compare(Box<? extends Fruit> box) {
        return box.getWeight().equals(getWeight());
    }

    void moveTo(Box<T> box) {
        if (this == box) {
            return;
        }

        while (!storage.isEmpty()) {
            box.add(storage.remove(storage.size() - 1));
        }
        System.out.println("Пересыпаем");
    }


    Float getWeight() {
        Float weight = 0f;

        for (T w : storage) {
            weight += w.getWeight();
        }

        return weight;
    }

    int count() {
        return storage.size();
    }
}