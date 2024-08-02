package defaultMethods;

interface Vehicle {
    void start();

    // Default method
    default void turnOff() {
        System.out.println("The vehicle is turning off.");
    }
}
