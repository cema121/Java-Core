package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1,  symbol)) return true;
                if (checkLine(i, j, 1, 1,  symbol)) return true;
                if (checkLine(i, j, 1, 0,  symbol)) return true;
                if (checkLine(i, j, -1, 1, symbol)) return true;
            }
        }
        return false;
    }

    public static boolean checkLine(int y, int x, int vy, int vx, char symbol) {
        int wayX = x + (DOTS_TO_WIN - 1) * vx;
        int wayY = y + (DOTS_TO_WIN - 1) * vy;
        if (wayX < 0 || wayY < 0 || wayX > SIZE - 1 || wayY > SIZE - 1) return false;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            int itemY = y + i * vy;
            int itemX = x + i * vx;
            if (map[itemY][itemX] != symbol) return false;
        }
        return true;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    setSymbol(i, j, DOT_O);
                    if (checkWin(DOT_O)) return;
                    setSymbol(i, j, DOT_EMPTY);
                }
            }

        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    setSymbol(i, j, DOT_X);
                    if (checkWin(DOT_X)) {
                        setSymbol(i, j, DOT_O);
                        return;
                    }
                    setSymbol(i, j, DOT_EMPTY);
                }
            }

        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1) + "\n");
        setSymbol(x, y, DOT_O);
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y (через пробел)");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        setSymbol(x, y, DOT_X);
    }

    public static void setSymbol(int x, int y, char symbol) {
        map[y][x] = symbol;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                map[j][i] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
