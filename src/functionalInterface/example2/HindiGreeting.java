package functionalInterface.example2;

public class HindiGreeting implements Greeting{

    @Override
    public void greet() {
        System.out.println("Namaste India!");
    }
}
