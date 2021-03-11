package Lesson6;

public class Cat extends Animal {
    public static final int MAX_RUN = 200;
    public static final int MAX_SWIM = 0;

    public Cat(String name) {
        super(name, MAX_RUN, MAX_SWIM);
    }

    @Override
    public void run(int length) {
        if (length <= MAX_RUN) {
            System.out.println("Кот по кличке " + name + " пробежал " + length + "м.");
        } else {
            System.out.println("Кот по кличке " + name + " устал и не добежала. Максимальная дистанция " + MAX_RUN + "м.");
        }
    }

    @Override
    public void swim(int length) {
        if (MAX_SWIM == 0){
            System.out.println("Кот по кличке " + name + " не умеет плавать");
        } else if (length <= MAX_SWIM) {
            System.out.println("Кот по кличке " + name + " проплыл " + length + "м.");
        } else {
            System.out.println("Кот по кличке " + name + " не смог доплыть до берега. Максимальная дистанция " + MAX_SWIM + "м.");
        }
    }
}
