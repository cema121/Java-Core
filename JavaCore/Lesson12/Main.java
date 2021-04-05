package Lesson12;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        System.out.println("\n[Метод 1]");
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
        long a = System.currentTimeMillis();
        calculateNewValue(arr);
        System.out.println("Время работы: " + (System.currentTimeMillis() - a));
    }

    private static void second() {
        System.out.println("\n[Метод 2]");
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
        long a = System.currentTimeMillis();

        float[] half1 = new float[HALF];
        float[] half2 = new float[HALF];
        System.arraycopy(arr, 0, half1, 0, HALF);
        System.arraycopy(arr, HALF, half2, 0, HALF);
        System.out.println("Время разбивки массива на два: " + (System.currentTimeMillis() - a));

        new Thread(() -> {
            calculateNewValue(half1);
            System.out.println("Просчет первой половины: " + (System.currentTimeMillis() - a));
        }).start();

        new Thread(() -> {
            calculateNewValue(half2);
            System.out.println("Просчет второй половины: " + (System.currentTimeMillis() - a));
        }).start();

        System.arraycopy(half1, 0, arr, 0, HALF);
        System.arraycopy(half2, 0, arr, HALF, HALF);
        System.out.println("Время склейки массивов в один: " + (System.currentTimeMillis() - a));
    }

    private static void calculateNewValue(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
}
