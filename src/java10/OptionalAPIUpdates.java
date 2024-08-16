package java10;

import java.util.Optional;

public class OptionalAPIUpdates {
    public static void main(String[] args) {
        OptionalAPIUpdates op = new OptionalAPIUpdates();
        String result = op.getName("Pramod");
        //Traditional Way
        if(result != null && result.equals("Pramod")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //with optional
        Optional<String> optional = Optional.ofNullable(op.getName("Pramod"));
        optional.ifPresentOrElse(
                System.out::println,
                () -> System.out.println(optional.get())
        );
    }

    public String getName(String name) {
        if(name.equals("Pramod")) {
            return name;
        } else {
            return null;
        }
    }
}
