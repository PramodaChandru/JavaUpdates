package java9.tryWithResource;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResource {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        try(fos) {
            fos.write("Testing write to file".getBytes());
            System.out.println("Added comments");
        } catch(Exception e) {
            System.out.println("Exception occurred");
        }
    }
}
