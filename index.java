class arithmeticalOperations { 
    int a, b;
    arithmeticalOperations(int x, int y) {
        a = x;
        b = y;
    }
    void add() {
        System.out.println("Addition: " + (a + b));
    }
    void subtract() {   
        System.out.println("Subtraction: " + (a - b));
    }   
    void multiply() {
        System.out.println("Multiplication: " + (a * b));
    }
    void divide() {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
    void modulus() {
        if (b != 0) {
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Modulus by zero is not allowed.");
        }
    }
}
public class index {
    public static void main(String[] args) {
        arithmeticalOperations operations = new arithmeticalOperations(10, 5);
        operations.add();
        operations.subtract();
        operations.multiply();
        operations.divide();
        operations.modulus();
    }
}