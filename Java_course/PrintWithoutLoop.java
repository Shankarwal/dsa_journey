// // Description: Print numbers from n to 1 without using any loop.
// // Implemented using recursion.
/* Also a non static method can be called from a static method indrectly by creating an object of the class
 * in the contructor of the class and calling the non static method from the constructor.
 */

// class Main {
//     public static void main(String[] args) { // Main method
//        new Main(); 
//     }
    
//     public Main() { // Constructor
//         printWithoutLoop(5);
//     }
    
//     public void printWithoutLoop(int n) { // Recursive method
//         System.out.println(n);
//         if (n == 1) {
//             return;
//         }
//         printWithoutLoop(n-1);
//     }
// }