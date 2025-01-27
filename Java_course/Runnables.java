// class A extends Thread {
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             System.out.println("hi");
//             // Putting thread to sleep to let other threas execute
//             try {
//                 Thread.sleep(1);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         // For smaller values it wont work take large values and see
//         for (int i = 0; i < 10; i++) {
//             System.out.println("Hello");
//             // Putting thread to sleep to let other threas execute
//             try {
//                 Thread.sleep(1);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// To work with Runnable Interface we need not declare the above two classes
public class Runnables {
    public static void main(String[] args) {
        // Runnable with Anonymous class
        // Runnable r1 = new Runnable() {
        //     public void run() {
        //         for (int i = 0; i < 10; i++) {
        //             System.out.println("hi");
        //             try {
        //                 Thread.sleep(1);
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // };

        // Runnable with Lambda Expression
        Runnable r1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Runnable with Anonymous class
        // Runnable r2 = new Runnable() {
        //     public void run() {
        //         for (int i = 0; i < 10; i++) {
        //             System.out.println("hello");
        //             try {
        //                 Thread.sleep(1);
        //             } catch (InterruptedException e) {
        //                 e.printStackTrace();
        //             }
        //         }
        //     }
        // };

        // Runnable with Lambda Expression
        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Below code will give error because r1 and r2 are Runnables not Threads
        // And Runnables have no methods Like Run()
        // Runnables is a Functional inerface
        // r1.start();
        // r2start();

        // Solution for above issue
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
