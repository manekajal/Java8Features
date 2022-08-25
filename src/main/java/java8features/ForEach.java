package java8features;

import java.util.HashMap;
import java.util.Map;

public class ForEach {
    public static void main(String[] args) {
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "kajal");
        namesMap.put(2, "Teju");
        namesMap.put(3, "Lata");
        System.out.println("Key Value");
        namesMap.forEach((key, value) -> System.out.println(key + "   " + value));
        System.out.println("Using for each");
    }
}
