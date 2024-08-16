package java12;

public class StringUtilities {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str.indent(4));

        str = "    Hello World";
        System.out.println(str.indent(-3));

        str = "Hello World";
        String result = str.transform(String::toUpperCase)
                .transform(s -> new StringBuilder(s).reverse().toString());
        System.out.println(result);

        System.out.println(result.substring(3).length());
    }
}
