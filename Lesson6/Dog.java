package Lesson6;

public class Dog extends Animal {
    public static final int MAX_RUN = 500;
    public static final int MAX_SWIM = 10;

    public Dog(String name) {
        super(name, MAX_RUN, MAX_SWIM);
    }

    @Override
    public void run(int length) {
        if (length <= MAX_RUN) {
            System.out.println("Собака по кличке " + name + " пробежала " + length + "м.");
        } else {
            System.out.println("Собака по кличке " + name + " устала и не добежала. Максимальная дистанция " + MAX_RUN + "м.");
        }
    }

    @Override
    public void swim(int length) {
        if (MAX_SWIM == 0){
            System.out.println("Собака по кличке " + name + " не умеет плавать");
        } else if (length <= MAX_SWIM) {
            System.out.println("Собака по кличке " + name + " проплыла " + length + "м.");
        } else {
            System.out.println("Собака по кличке " + name + " не смогла доплыть до берега. Максимальная дистанция " + MAX_SWIM + "м.");
        }
    }
}
