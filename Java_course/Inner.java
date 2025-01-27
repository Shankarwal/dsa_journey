class A {
    public void display() {
        System.out.println("In the outer display");
    }

    public class B {
        public void display() {
            System.out.println("In the inner display");
        }
    }

}

abstract class B {
    public abstract void display(); // Abstract method
}

public class Inner {
    public static void main(String[] args) {
        A test = new A();
        test.display(); // In the outer display
        // B b = new B(); // Can not directly access B class as it is inner class
        // A.B b = new B(); // Can access B class by using outer class reference, but
        // still it will give error
        // A.B b = new A.B(); // This is the not correct way either
        // B b = test.new B(); // This will give error as B is not defined

        // Correct way to access inner class
        A.B b = test.new B();
        b.display(); // In the inner display

        // Anonymous inner classes are used when you need to override the methods of a
        // class or an interface
        A test1 = new A() { // Anonymous inner class
            public void display() {
                System.out.println("In the outer display");
            }
        };

        test1.display();

        // Using anonymous inner class to override the abstract method of class B
        B test3 = new B() {
            public void display() {
                System.out.println("In anonymous inner display");
            }
        };
        test3.display(); // In anonymous inner display
    }
}
