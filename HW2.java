import java.util.Arrays;

public class HW2 {

    public static void main(String[] args) {

    invertArray();
    fillArray();
    changeArray();
    fillDiagonal();
    maxAndMin();
    System.out.println(checkBalance());
    seven();
    }

    //Задание 1
    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1");
        System.out.println("Исходные данные: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println("Результат: " + Arrays.toString(array));
    }

    //Задание 2
    public static void fillArray() {
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j = j + 3) {
            array[i] = j;
        }
        System.out.println("Задание 2");
        System.out.println(Arrays.toString(array));
    }

    // Задание 3
    public static void changeArray() {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println("Задание 3");
        System.out.println(Arrays.toString(array));
    }

    // Задание 4
    public static void fillDiagonal() {
        int array[][] = new int[4][4];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            array[i][j] = 1;
        }
        for (int i = 0, j = 3; i < array.length; i++, j--) {
            array[i][j] = 1;
        }
        System.out.println("Задание 4");
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(Arrays.toString(array[2]));
        System.out.println(Arrays.toString(array[3]));
    }
    // Задание 5
    public static void maxAndMin () {
        System.out.println("Задание 5");
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int max = 0;
        for (int i : array) {
            if (i > max)
                max = i;
        }
        System.out.println("Максимальное: " + max);

        int min = max;
        for (int i : array) {
            if (i < min)
                min = i;
        }
        System.out.println("Минимальное: " + min);
    }

    // Задание 6
    public static boolean checkBalance () {
        System.out.println("Задание 6");
        int[] array = {2, 2, 2, 1, 2, 2, 10, 1};
            for (int i = 0; i < array.length; i++) {
                int iSum = 0, jSum = 0;
                for (int j = 0; j < i; j++) {
                    jSum += array[j];
                }
                for (int f = i; f < array.length; f++) {
                    iSum += array[f];
                }
                if (iSum == jSum) return true;
            }
            return false;
        }

    // Задание 7 (не сделано)
    public static void seven () {
        System.out.println("Задание 7");
        int[] array = {3, 5, 6, 1};
        int n = 2;
        System.out.println(Arrays.toString(array) + " сдвиг на " + n);

    }

}