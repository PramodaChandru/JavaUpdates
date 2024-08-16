package java16.InstanceOf;

public class InstanceOf {
    public static void main(String[] args) {
        Object obj = "Hello";
        if(obj instanceof String) {
            String s = (String) obj;
            System.out.println(s);
        }

        System.out.println("Enhanced instance of");
        obj = "Hello";
        if(obj instanceof String s) {
            System.out.println(s);
        }
    }
}
