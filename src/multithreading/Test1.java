package multithreading;

public class Test1 {
    public static void main(String[] args) {




        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();

        Runnable r2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child 2 iteration"+i);
            }
        };

        Thread t2 = new Thread(r2);
        t2.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread, iteration "+i);
        }
    }
}
