package java8.streams;

import java8.utility.Data;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> users = Data.users(2);
        List<String> result = users.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
