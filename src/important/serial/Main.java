package important.serial;

import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) {
        User user = new User();
        user.name = "pramod";
        user.password = "test";
    }
}
