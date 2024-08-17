package java8.utility;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private static int[] sampleArr;
    public static void printArray(int[] arr) {
        System.out.print("original Array ====> ");
        for(int i : sampleArr) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        System.out.print("result Array ====> ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] sampleArray(int n) {
        sampleArr = new int[n];
        for(int i = 0; i < n; i++) {
            sampleArr[i] = i + 1;
        }
        return sampleArr;
    }

    public static List<Employee> sampleEmployees(int n) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("pramod", 32));
        emp.add(new Employee("test", 25));
        return emp;
    }

    public static List<String> users(int n) {
        List<String> users = new ArrayList<>();
        users.add("pramod");
        users.add("admin");
        return users;
    }
}
