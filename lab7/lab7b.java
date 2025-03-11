public class lab7b {
    static String messages[] = {"I", "Love", "Java", "Programming", "Language", "Very", "Much"};
    static class SyncThread extends Thread {

        SyncThread(String name) {
            super(name);
        }

        public void run() {
            for (int i = 0; i < messages.length; i++) {
                System.out.println(getName() + ": " + messages[i]);
            }
        }
    }

    public static void main(String[] args) {
        SyncThread t1 = new SyncThread("Odd");
        SyncThread t2 = new SyncThread("Even");
        t1.run();
        t2.run();
    }
}