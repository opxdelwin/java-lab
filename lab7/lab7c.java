public class lab7c {
    private static final int MAX = 5;
    private static int buffer[] = {-1,-1,-1,-1,-1};

    static int produce_event() {
        return (int) (Math.random() * 100);
    }
    static void consume_event(int event, String name) {
        System.out.println(name + ": Consumed " + event);
    }

    static class Producer extends Thread {
        int production_index;
        Producer() {
            super("Producer");
            this.production_index=0;
        }

        public void run() {
            int index;
            while (true) {
                index = (this.production_index+1)% MAX;
                if (buffer[index] == -1) {
                    buffer[index] = produce_event();
                    System.out.println(getName() + ": Produced " + buffer[index]);
                    this.production_index = index;
                } else {
                    System.out.println(getName() + ": Buffer is full at "+ index);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Consumer extends Thread {
        int consumption_index;
        Consumer() {
            super("Consumer");
            this.consumption_index=0;
        }

        public void run() {
            int index;
            while (true) {
                index = (this.consumption_index+1)% MAX;
                if (buffer[index] != -1) {
                    consume_event(buffer[index], getName());
                    buffer[index] = -1;
                    this.consumption_index = index;
                } else {
                    System.out.println(getName() + ": Buffer is empty at "+ index);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        producer.start();
        consumer.start();
    }
}