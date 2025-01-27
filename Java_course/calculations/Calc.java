package calculations;

public class Calc {
    private int test = 10; // Accessible only within the class
    public int add (int n1, int n2) {
        System.out.println(test);
        return n1 + n2;
    }
}