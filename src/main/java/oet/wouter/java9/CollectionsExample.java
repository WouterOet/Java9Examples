package oet.wouter.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsExample {

    private final Set<String> set = Set.of("Hallo", "World");
    private final List<String> list = List.of("Hallo", "World");
    private final Map<String, String> map = Map.of("Key", "Value");

    public static void main(String[] args) {
        new CollectionsExample().run();
    }

    public void run() {
        System.out.println(map.size());

        try {
            list.add("This won't work");
        } catch (UnsupportedOperationException e) {
            System.err.println("Told you so");
        }
    }
}
