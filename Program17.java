abstract class Abst {
    public abstract int calculate(int a, int b);
}

class Divide extends Abst {
    
    public int calculate(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0; // Or throw an exception
        }
        return a / b;
    }
}


class Multiply extends Abst {
    
    public int calculate(int a, int b) {
        return a * b;
    }
}


public class Program17 {
    public static void main(String[] args) {
        Abst Calculator;

        // Using Divide
        Calculator = new Divide();
        System.out.println("Divide: " + Calculator.calculate(10, 2));  // Output: 5
        

        // Using Multiply (same object name)
        Calculator = new Multiply();
        System.out.println("Multiply: " + Calculator.calculate(10, 2));  // Output: 20
    }
}
