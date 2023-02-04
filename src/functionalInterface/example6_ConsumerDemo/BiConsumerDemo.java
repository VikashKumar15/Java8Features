package functionalInterface.example6_ConsumerDemo;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (s1,s2) -> System.out.println("This is first agr: "+s1+" This is 2nd arg: "+s2);

        biConsumer.accept("First Arg", "Second Arg");
    }
}
