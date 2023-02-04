package functionalInterface.example7_FunctionInterface;

import java.util.function.Function;

public class FuntionalInterfaceDemo2 {

    public static void main(String[] args) {

        Function<Integer, Integer> increment = i -> i+10;
        Function<Integer, Integer> multiply = i -> i*10;

        //Since we are doing compose so it will multiply first and then will increment.
        System.out.println("Compose result: "+increment.compose(multiply).apply(10));

        //If we use andThan so it will increment first and then will multiply.

        System.out.println("AndThan result: "+increment.andThen(multiply).apply(10));
    }
}
