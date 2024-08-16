package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtility {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("output.txt");
        Files.writeString(path, "File utilities");

        String result = Files.readString(path);
        System.out.println(result);
    }
}
