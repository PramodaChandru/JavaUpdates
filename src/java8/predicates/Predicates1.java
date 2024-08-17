package java8.predicates;

import java.util.function.Predicate;

public class Predicates1 {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (num) -> num == 2020;
        System.out.println(predicate.test(2020));
        System.out.println(predicate.test(2021));
    }
}
