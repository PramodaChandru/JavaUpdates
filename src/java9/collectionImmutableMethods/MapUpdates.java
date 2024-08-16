package java9.collectionImmutableMethods;

import java.util.Map;

public class MapUpdates {
    public static void main(String[] args) {
        MapUpdates mu = new MapUpdates();
        mu.map1();
        mu.map2();
    }

    public void map1() {
        Map<Integer, String> map = Map.of(1, "a", 2, "b",3, "c");
        map.forEach((k, v) -> System.out.println(k + " " +v));
    }

    public void map2() {
        Map<Integer, String> map = Map.ofEntries(
                Map.entry(1, "a"),
                Map.entry(2, "b")
        );
        System.out.println("Map of Entries");
        map.forEach((k, v) -> System.out.println(k + " " + v));
    }
}