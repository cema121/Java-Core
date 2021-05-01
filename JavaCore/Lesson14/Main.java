package Lesson14;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n[Метод 1]");
        int[] a1 = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] a2 = {4, 4, 1, 3, 1, 7};
        int[] a3 = {1, 2, 3, 2, 3}; // нет 4
        int[] a4 = {4, 2, 1, 2, 3, 2, 1, 7};

        first(a1);
        first(a2);
        first(a3);
        first(a4);

        System.out.println("\n[Метод 2]");
        int[] b1 = {1, 1, 1, 4, 4, 1, 4, 4};
        int[] b2 = {1, 1, 1, 1, 1, 1};
        int[] b3 = {4, 4, 4, 4};
        int[] b4 = {1, 4, 4, 1, 1, 4, 3};
        System.out.println("Массив: " + Arrays.toString(b1) + " состоит только из чисел 1 и 4: [" + second(b1) + "]");
        System.out.println("Массив: " + Arrays.toString(b2) + " состоит только из чисел 1 и 4: [" + second(b2) + "]");
        System.out.println("Массив: " + Arrays.toString(b3) + " состоит только из чисел 1 и 4: [" + second(b3) + "]");
        System.out.println("Массив: " + Arrays.toString(b4) + " состоит только из чисел 1 и 4: [" + second(b4) + "]");
    }

    public static void first(int[] array) {
        int[] arr = ArrayUtils.subarray(array, (ArrayUtils.lastIndexOf(array, 4) + 1), array.length);
        try {
            if (!ArrayUtils.contains(array, 4))
                throw new RuntimeException("В массиве нет цифры [4]");
            System.out.println(Arrays.toString(arr));
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    public static boolean second(int[] array) {
        return (ArrayUtils.contains(array, 1)
                && ArrayUtils.contains(array, 4)
                && !ArrayUtils.contains(array, 2)
                && !ArrayUtils.contains(array, 3)
                && !ArrayUtils.contains(array, 5)
                && !ArrayUtils.contains(array, 6)
                && !ArrayUtils.contains(array, 7)
                && !ArrayUtils.contains(array, 8)
                && !ArrayUtils.contains(array, 9)
                && !ArrayUtils.contains(array, 0)
        );
    }
}
