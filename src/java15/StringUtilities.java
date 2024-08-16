package java15;

public class StringUtilities {
    public static void main(String[] args) {
        int id = 100;
        String name = "Pramod";

        //Traditional
        String user = String.format("%s %d", name, id);
        System.out.println(user);

        //new approach
        user = "%s %d".formatted(name, id);
        System.out.println(user);
    }
}
