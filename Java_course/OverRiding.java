class Calc {
    public int add (int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    public int add (int n1, int n2) { // Overriding parent class method
        return n1 + n2 + 1;
    }
}

public class OverRiding {
    public static void overriding(StringsInJava[] args) {
        AdvCalc calc = new AdvCalc();
        System.out.println(calc.add(10, 20));
    }
}