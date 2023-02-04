package functionalInterface.example5_supplierDemo;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo1 {

    static boolean isPersonEligibleForVoting(Supplier<Person> supplier, Predicate<Person> predicate){
        
        return predicate.test(supplier.get());
    }

    public static void main(String[] args) {
//        Supplier<Person> supplier = new Supplier<Person>() {
//            @Override
//            public Person get() {
//                return new Person("Alex", 24);
//            }
//        };
        
        Supplier<Person> supplier = () -> new Person("Alex", 24);
        Predicate<Person> predicate = p -> p.getAge()>18 ;

        Boolean isEligible = isPersonEligibleForVoting(supplier, predicate);

        System.out.println("Is person eligible for voting "+isEligible);
    }
}
