
@FunctionalInterface
interface Test {
    void SayHello(String name);
}
public class LambdaExpr {
    public static void main(String[] args) {
        Test obj = (name) -> System.out.println("hello " + name);
        obj.SayHello("Pramod");
    }
}
