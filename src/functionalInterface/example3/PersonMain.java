package functionalInterface.example3;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("John", 23, "USA"));
        personList.add(new Person("Carl", 23, "Australia"));
        personList.add(new Person("Amit", 23, "India"));
        personList.add(new Person("Amir", 23, "Pakistan"));
        personList.add(new Person("Kane", 23, "Brazil"));
        personList.add(new Person("Alex", 23, "Canada"));

        System.out.println("Sorting person list based on their name");

        List<Person> sortedPersons = PersonService.getSortedPersons(personList);
        for (Person person: sortedPersons) {
            System.out.println(person.getName());
        }
    }
}
