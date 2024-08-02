interface Calculator {
    // Static method
    static int add(int a, int b) {
        return a + b;
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        // Calling static method of the interface
        int result = Calculator.add(5, 10);
        System.out.println("Sum: " + result);
    }
}
