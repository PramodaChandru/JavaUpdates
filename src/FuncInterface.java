@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class FuncInterface {
    public static void main(String[] args) {
        // Using a lambda expression
        Greeting greeting = name -> System.out.println("Hello, " + name);
        greeting.sayHello("Alice");
    }
}