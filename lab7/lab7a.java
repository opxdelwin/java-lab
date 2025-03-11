import java.util.Scanner;

public class lab7a {
    static class CounterThread extends Thread {
        private int lower;
        private int upper;

        CounterThread(String name, int lower, int upper) {
            super(name);
            this.lower = lower;
            this.upper = upper;
        }

        public void run() {
            for (int i = lower; i <= upper; i++) {
                System.out.println(getName() + ": " + i);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    System.out.println("Thread " + getName() + " interrupted");
                    e.printStackTrace();
                }
            }
        }

    }
    public static void main(String[] args) {
        String name;
        int lower;
        int upper;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the thread: ");
        name = sc.nextLine();
        System.out.println("Enter the lower limit: ");
        lower = sc.nextInt();
        System.out.println("Enter the upper limit: ");
        upper = sc.nextInt();

        CounterThread t1 = new CounterThread(name, lower, upper);
        t1.start();
    }
}