package functionalInterface.example2;

public class WellWisher {

    public static void wish(Greeting g){
        g.greet();
    }

    public static void main(String[] args) {

        //This is a classic object-oriented programming example. Now, what if we want our WellWisher class to greet in all the languages available?
        //Do we need to create a class for each language, e.g., SpanishGreeting, FrenchGreeting, etc?

        Greeting g1 = new HindiGreeting();
        Greeting g2 = new EnglishGreeting();

        wish(g1);
        wish(g2);

        wish(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Want to greet in french, but i don't know french");
            }
        });

        Greeting g3 = new Greeting() {
            @Override
            public void greet() {
                System.out.println("This is  another way to greet!");
            }
        };

        g3.greet();

        wish(
            () ->
                System.out.println("Greet using lambda expression!")
        );

        Greeting g4 = () -> System.out.println("Another way to greet using lambda expression!");
        g4.greet();


    }
}
