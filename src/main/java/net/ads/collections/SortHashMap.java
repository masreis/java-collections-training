package net.ads.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMap {

    public static void main(String[] args) {

        Map<Integer, String> unsorted = new HashMap<>();

        unsorted.put(1, "d");
        unsorted.put(2, "c");
        unsorted.put(3, "b");
        unsorted.put(4, "a");
        
        Map<Integer, String> sorted = unsorted

                .entrySet()

                .stream()

                .sorted(Entry.comparingByValue())

                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (key1, key2) -> key1, LinkedHashMap::new));
        
        System.out.println(sorted);

        unsorted

                .entrySet()

                .stream()

                .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))

                .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));

    }
}
