package functionalInterface.example6_ConsumerDemo;

import java.util.function.Consumer;

public class ConsumerDemo1 {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println("Consumer is: "+s);

        consumer.accept("Hey!! this is consumer");

        Consumer<String> consumer2 = s -> System.out.println(s+ " I am Alex");
        Consumer<String> consumer3 = s-> System.out.println(s+" I am from Canada");

        consumer2.andThen(consumer3).accept("Hello");
    }
}
