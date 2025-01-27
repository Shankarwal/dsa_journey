enum Laptop {
    // these all are objects of enum Laptop created internally
    Dell(30000), HP(32000), Mackbook(130000), Lenevo;
    private int price;

    private Laptop() {
        this.price = 26000;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return this.name() + " :" + this.price;
    }
}

// Not allowed as enum can't be extended
// class X entends Laptop {  
// }

public class Enums {
    // Below line will give error as we can't create object directly;
    // Laptop laptop = Laptop.Mackbook;
    /*The problem is that you are trying to call a method directly in the class body
    * which is not allowed. You should move the method call inside a method.
    */
    // laptop.getPrice();


    public static void main(String[] args) {
        Laptop[] laptops = Laptop.values();

        for (Laptop lap : laptops) {
            System.out.println(lap.getPrice());
            System.out.println(lap.toString());
        }
    }
}
