package java8.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicate2 {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("India", 91));
        countries.add(new Country("USA", 1));

        Predicate<Country> predicate = (country) -> country.getCountryName().startsWith("I");
        for(Country c : countries) {
            if (predicate.test(c)) {
                System.out.println(c);
            }
        }
    }
}
