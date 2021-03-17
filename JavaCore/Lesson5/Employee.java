package Lesson5;

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private long salary;
    private int age;

    Employee(String name, String position, String email, String phone, long salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int GetAge() {
        return age;
    }

    void Print() {
        System.out.printf("ФИО: %s, Должность: %s, почта: %s, телефон: %s, оклад: %d уе, возраст: %d\n", name, position, email, phone, salary, age);
    }
}
