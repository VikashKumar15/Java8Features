package functionalInterface.example7_FunctionInterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a+b;

        System.out.println("Result of biFunction: "+biFunction.apply(10,20));
    }
}
