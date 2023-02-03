package functionalInterface.example4_predicateDemo;

import java.util.function.Predicate;

public class PredicateDemo {

    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("Alex", 23);

//        Predicate<Person> predicate = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getAge()>18;
//            }
//        };

        Predicate<Person> predicate = p -> p.getAge()>18;

        boolean isPersonEligible = isPersonEligibleForVoting(person, predicate);

        System.out.println("Person is eligible for voting "+isPersonEligible);

    }
}
