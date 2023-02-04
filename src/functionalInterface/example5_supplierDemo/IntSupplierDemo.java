package functionalInterface.example5_supplierDemo;

import java.util.function.IntSupplier;

public class IntSupplierDemo {

    public static void main(String[] args) {

        IntSupplier intSupplier = () -> (int) (Math.random()*100);

        System.out.println("Random Integer for supplier Int "+intSupplier.getAsInt());
    }
}
