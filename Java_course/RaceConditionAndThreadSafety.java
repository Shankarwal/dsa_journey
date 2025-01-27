class Counter {
    int count;

    // To make this method Thread safe use "synchronized"
    public synchronized void increment () {
        count++;
    }
}

public class RaceConditionAndThreadSafety {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // Will give diff output each time on execution
        // Reason because main won't wait for t1 and t2 to be done, It will complete its job before them
        // System.out.println(c.count);

        // To make the main thread wait for the other threads we can use Join method

        t1.join();
        t2.join();
        // Out put may still not be 2000 all the times the code is executed
        // Because we can not control the Threads completely
        // After we make the meathod thread safe the Output will be consistent
        System.out.println(c.count);
    }
}
