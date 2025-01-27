// class A {
//     public A () { // Constructor with no arguments
//         super();
//         System.out.println("In defualt constructor");
//     }

//     public A (int n) { // Constructor with one argument
//         super();
//         System.out.println("In argumented constructor");
//     }
// }

// class B extends A {
//     public B () { // Constructor with no arguments
//         super(); // Calling constructor of parent class
//         System.out.println("In defualt constructor");
//     }

//     public B (int n) { // Constructor with one argument
//         super(); // Calling constructor of parent class
//         this(); // Calling constructor fo the same class
//         System.out.println("In argumented constructor");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         B b = new B(); // Output: In defualt constructor, In defualt constructor
//         B b1 = new B(5); // Output: In defualt constructor, In defualt constructor, In argumented constructor
//     }
// }