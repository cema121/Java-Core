package Lesson6;

public abstract class Animal {
    protected String name;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
    }

    public abstract void run(int length);

    public abstract void swim(int length);

}
