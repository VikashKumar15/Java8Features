package functionalInterface.example2;

public class EnglishGreeting implements Greeting{

    @Override
    public void greet() {
        System.out.println("Hello India!");
    }
}
