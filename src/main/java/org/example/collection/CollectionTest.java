package org.example.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionTest {

    public static void main(String[] args) {
        // list of string , group by value, key should value, value should count the occurence

        List<String> stringList = List.of("abc", "bcd", "abc","bcd");
        Map<String, Long> stringLongMap = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringLongMap);

    }


}