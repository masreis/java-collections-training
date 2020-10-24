package net.ads.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExperimentsOnCollections {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> unmod = Collections.unmodifiableList(list);
        
        List<String> single = Collections.singletonList("");
        // Java 13
//        String s = """
//                marco
//                """;
        System.out.println();
    }
}
