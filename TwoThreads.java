import java.util.Random;

public class TwoThreads {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task1());
        Thread t2 = new Thread(new Task2());

        t1.start();
        t2.start();
    }

    static class Task1 implements Runnable {
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello World");
            }
        }
    }

    static class Task2 implements Runnable {
        public void run() {
            Random rand = new Random();
            for (int i = 0; i < 100; i++) {
                int num = rand.nextInt(140) + 110;
                System.out.println(num);
            }
        }
    }

}