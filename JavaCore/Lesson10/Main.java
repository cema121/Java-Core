package Lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    public static void exercise1() {
        System.out.println("\nЗадание 1:");
        List<String> wordList = new ArrayList();
        wordList.add("Яблоко");
        wordList.add("Груша");
        wordList.add("Яблоко");
        wordList.add("Яблоко");
        wordList.add("Слива");
        wordList.add("Апельсин");
        wordList.add("Виноград");
        wordList.add("Крыжовник");
        wordList.add("Малина");
        wordList.add("Клубника");
        wordList.add("Груша");
        wordList.add("Яблоко");
        wordList.add("Груша");
        wordList.add("Клубника");

        Set<String> unicumList = new HashSet<>(wordList);
        System.out.println("List без дубликатов - " + unicumList);

        for (String s : new HashSet<>(wordList))
            System.out.println(s + " - " + Collections.frequency(wordList, s) + " раз.");
    }

    public static void exercise2() {
        System.out.println("\nЗадание 2:");
        Phonebook.add("Иванов", "+123456789");
        Phonebook.add("Иванова", "+712345678");
        Phonebook.add("Петров", "+4423423523");
        Phonebook.add("Сидоров", "+382342355");
        Phonebook.add("Дмитриев", "+1988687");
        Phonebook.add("Королев", "+11234");
        Phonebook.add("Иванов", "+2353245");

        Phonebook.get("Иванов");
        Phonebook.get("Петров");

    }
}
