package Lesson5;

public class HW5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employeeArray[1] = new Employee("Andrey", "Engineer", "Andrey@mailbox.com", "892312313", 25000, 42);
        employeeArray[2] = new Employee("Philipp", "Engineer", "Kostia@mailbox.com", "892312314", 31000, 45);
        employeeArray[3] = new Employee("Sasha", "Senior Engineer", "Sasha@mailbox.com", "892312315", 90000, 21);
        employeeArray[4] = new Employee("Boris", "Engineer", "Boria@mailbox.com", "892312316", 40000, 23);

        System.out.printf("Сотрудники старше 40 лет:\n");
        for(Employee item : employeeArray) {
            if(item.GetAge() > 40) item.Print();
        }
    }
}
