package org.example.window;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,2,3,2,4);

        Map<Integer, Long> freqCount = numbers.stream()
                .collect(Collectors.
                        groupingBy(Function.identity(), Collectors.counting()));

        freqCount.entrySet().stream().filter(entry -> entry.getValue() >1).forEach(System.out::println);



    }
}
