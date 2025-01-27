abstract class Car { // Abstract class
    public abstract void run();

    public void walk() {
        System.out.println("Walking");
    }
}

class Taigo extends Car { // Concrete class (non-abstract)
    public void run() {
        System.out.println("Running");
    }

    public void walk() {
        System.out.println("Walking");
    }
}

class Abstract {
    public static void main(StringsInJava[] args) {
        // Car c = new Car(); // Error: Car is abstract; cannot be instantiated
        Car c = new Taigo();
        c.run();
        c.walk();
    }
}