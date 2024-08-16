package java11;

import java.util.List;
import java.util.stream.Stream;

public class StringUtility {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.repeat(2));

        str = "      Hello World    ";
        System.out.println(str.strip() + " Test");


        str = "      Hello World    ";
        System.out.println(str.stripLeading() + " Test");

        str = "      Hello World    ";
        System.out.println(str.stripTrailing() + " Test");

        str= "Hello\nWorld\nTest";
        Stream<String> list= str.lines();
        System.out.println(list.toList());

    }
}
