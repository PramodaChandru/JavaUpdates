package java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMismatchDemo {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("output.txt");
        Path path1 = Paths.get("output1.txt");

        Files.writeString(path1, "File utilities");

        System.out.println(Files.mismatch(path, path1));
    }
}
