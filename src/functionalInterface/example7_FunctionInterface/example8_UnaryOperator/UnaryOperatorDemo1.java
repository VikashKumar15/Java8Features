package functionalInterface.example7_FunctionInterface.example8_UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo1 {

    public static void main(String[] args) {

        Person person = new Person();

        UnaryOperator<Person> operator  = p -> {
            p.setAge(24);
            p.setName("Alex");
            return p;
        };

        operator.apply(person);
        System.out.println("Person name is: "+person.getName()+". His age is: " +person.getAge());
    }
}
