package java15;

public class TextBlocks {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);

        str = """
                Hello World""";
        System.out.println(str);

        str = """
                Hello
                World""";
        System.out.println(str);

        str = """
                Hello\
                World""";
        System.out.println(str);

        str = """
                Hello \
                World""";
        System.out.println(str);

        str = """
                {
                    id: "1",
                    name:"Pramod"
                }""";

        System.out.println(str);
    }
}
