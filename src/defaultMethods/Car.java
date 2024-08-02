package defaultMethods;

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car is starting.");
    }

    // Override the default method
    @Override
    public void turnOff() {
        System.out.println("The car is turning off.");
    }
}
