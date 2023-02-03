package functionalInterface;

public class TestImpl {

    public static void main(String[] args) {

        Interf i = () -> {
            System.out.println("Hello");
        };
        i.test();
    }
}
