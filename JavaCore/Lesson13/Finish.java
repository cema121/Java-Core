package Lesson13;

public class Finish extends Stage {
    private int finishLine = 1;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";

    @Override
    public void go(Car c) {
        if (finishLine == 0) {
            System.out.println(ANSI_GREEN + "[Время: " + System.currentTimeMillis() + "] " + c.getName() + " -> Финишировал" + ANSI_RESET);
        } else {
            finishLine--;
            System.out.println(ANSI_YELLOW + "[Время: " + System.currentTimeMillis() + "] " + c.getName() + " -> Финишировал первым!" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "\nПОБЕДИТЕЛЬ [" + c.getName() + "]\n" + ANSI_RESET);

        }
    }
}