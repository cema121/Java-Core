package Lesson10;

import java.util.*;

class Phonebook {
    private static Map<String, List<String>> phonebook = new HashMap();

    static void add(String name, String phoneNumber) {
        List<String> phone = phonebook.getOrDefault(name, new ArrayList<>());
        phone.add(phoneNumber);
        phonebook.put(name, phone);
    }

    static void get(String name) {
        System.out.println(name + phonebook.getOrDefault(name, new ArrayList<>()));
    }
}



