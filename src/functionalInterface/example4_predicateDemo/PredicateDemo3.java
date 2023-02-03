package functionalInterface.example4_predicateDemo;

import java.util.function.Predicate;

public class PredicateDemo3 {

    public static void main(String[] args) {

        Predicate<String> predicate = p -> p.equals("Welcome");

        System.out.println(predicate.test("Welcome"));
    }
}
