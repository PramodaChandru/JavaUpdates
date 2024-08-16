package java17;

sealed interface Vehicle permits Car {

}

final class Car implements Vehicle {

}

public class SealedExample {
}
