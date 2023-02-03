package functionalInterface.example4_predicateDemo;

import java.util.function.Predicate;

public class PredicateDemo2 {

    static  boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate){

        return predicate.test(person);
    }

    public static void main(String[] args) {

        Person person = new Person("Alex", 23);

        Predicate<Person> ageGraterThan18 = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge()>18;
            }
        };

        Predicate<Person> ageLessThan60 = p -> p.getAge()<60;

        Predicate<Person> predicate = ageGraterThan18.and(ageLessThan60);

        Boolean isEligible = isPersonEligibleForVoting(person, predicate);

        System.out.println("Is person eligible for voting "+isEligible);

    }
}
