package java10;

public class VarType {
    private static String append = "Hello";
    public static void main(String[] args) {
        var name = "Pramod";
        System.out.println(append + " " + name);
    }
}
