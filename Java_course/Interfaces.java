interface Animal {
    // By default all variable, public, static, and final
    int age = 10;
    String color = "Black";

    // By default all methods, public and abstract
    void eat();
    void sleep();
}

interface Animal1 {
    void sleep();
}

interface Animal2 extends Animal1 { // Interface can extend another interface
    void play();
}

// Dog class must implement all methods of Animal interface
// Multiple inheritance is possible in interfaces
class Dog implements Animal, Animal2 {
    public void eat() {
        System.out.println("Dog is barking");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

// Reference and object Differnce understanding
class A {
    public void show() {
        System.out.println("Show of A");
    }
}

class B extends A{
    public void test() {
        System.out.println("test of B");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();

        // Animal2 animal = new Dog();
        // animal.eat(); // Throws error because Animal2 interface doesn't have eat() method

        // Reference of A and object of B  => Only methods of A can be called
        A a = new B();
        a.show();
        // a.test(); // Throws error because A class doesn't have test() method
    }
}
