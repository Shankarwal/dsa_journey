class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            // Putting thread to sleep to let other threas execute
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        // For smaller values it wont work take large values and see
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            // Putting thread to sleep to let other threas execute
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Threads {
    public static void main(String[] args) {
        A testA = new A();
        B testB = new B();

        // setting priority of thread
        testA.setPriority(Thread.MAX_PRIORITY);

        testA.start();
        testB.start();
    }
}