import Models.Payable;
import Models.Employee;
import Models.Person;
import Models.Student;


import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Employee("Jonh","Lennon", "Manager", 27045.78));
        persons.add(new Employee("George","Harrison", "Teacher", 50000.00));

        persons.add(new Student("Ringo", "Starr", 2.5));
        persons.add(new Student("Paul", "McCartney", 3.99));

        Collections.sort(persons);

        printData(persons);
    }

    public static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            String position = (person instanceof Employee) ? "Employee" : "Student";
            System.out.printf("%s: %s earns %.2f tenge%n", position, person, person.getPaymentAmount());
        }
    }
}