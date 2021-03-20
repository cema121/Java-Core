package Lesson9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws MyArrayDataException {
        String[][] array = new String[][]{
                {"1", "2", "3", "4",},
                {"2", "3", "4", "1",},
                {"3", "4", "1", "2",},
                {"4", "1", "2", "3"}};
        try {
            checkArraySize(array);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка MyArraySizeException");
        }

        try {
            sumArrayData(array);
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка MyArraySizeException в ячейке:" + e.i + " " + e.j);
        }
    }

    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < array[i].length; j++) {
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

    public static void sumArrayData(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: " + sum);
    }
}
