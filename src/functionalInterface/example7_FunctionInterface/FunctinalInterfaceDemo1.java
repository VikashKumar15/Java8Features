package functionalInterface.example7_FunctionInterface;

import java.util.function.Function;

public class FunctinalInterfaceDemo1 {

    public static void main(String[] args) {
        // Created a function which string as input and return its length
        Function<String, Integer> lengthFunction = s -> s.length();

        System.out.println("String length for the input string is: "+lengthFunction.apply("This is awesome! "));
    }
}
