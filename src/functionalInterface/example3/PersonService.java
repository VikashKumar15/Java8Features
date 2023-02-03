package functionalInterface.example3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {

    public static List<Person> getSortedPersons(List<Person> personList) {

        Collections.sort(personList,
            (Person o1, Person o2) ->
                 o1.getName().compareTo(o2.getName())
        );

        return personList;
    }
}
