package functionalInterface.example4_predicateDemo;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateDemo {

    static Boolean isPersonEligibleForVoting(Person person, Integer minAge, BiPredicate<Person, Integer> predicate){
        return predicate.test(person, minAge);
    }

    public static void main(String[] args) {

        Person person = new Person("Alex", 24);
        Boolean isEligible = isPersonEligibleForVoting(person, 18, (p, minAge) -> p.getAge()>minAge);

        System.out.println("Person eligiblity "+isEligible);
    }
}
