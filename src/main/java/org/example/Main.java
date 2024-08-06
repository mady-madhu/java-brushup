package org.example;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception, IllegalMonitorStateException {

        List<String> fruits = Arrays.
                asList("apple", "banana", "apple", "orange",
                        "banana", "apple", "grape", "orange",
                        "banana", "grape");

        Map<String, Long> mapFruitsCount = fruits.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(mapFruitsCount);

        HashMap<String, Long> orderedMap = new LinkedHashMap<>();
        mapFruitsCount.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(stringLongEntry ->
                        orderedMap.put(stringLongEntry.getKey(), stringLongEntry.getValue()));

        System.out.println(orderedMap);

        String str = "hello";

        System.out.println(str.substring(0,3));
        System.out.println(str.substring(3));


    }


}