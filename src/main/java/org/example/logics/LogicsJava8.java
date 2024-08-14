package org.example.logics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LogicsJava8 {

    private List<Integer> items;

    public void DistinctWordsInFile(){
        String file = "src/main/resources/file_path_here.txt";
        Stream<String> str = null;
        try {
            str = Files.lines(Paths.get(file));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Map<String, Long> distinctwords = str.map(s -> s.split("\\s+"))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(distinctwords);
        //distinctwords.forEach(s -> System.out.println(s));
    }

    public void groupBYLogicFruits(){
        List<String> items = Arrays.asList("apple", "apple", "apple", "orange", "banana", "papaya");
        Map<String, Long> collect = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //sorting
        Map<String, Long> finalMap = new LinkedHashMap<>();
        collect.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered( m -> finalMap.put(m.getKey(),m.getValue()));

        System.out.println(finalMap);
    }

    public void convertListToArray(){
        List<Integer> items = Arrays.asList(1,2,3,4,5,6);
        int[] ints = items.stream().mapToInt(Integer::intValue).toArray();
        List<Integer> ints1 = Arrays.stream(ints).boxed().collect(Collectors.toList());
        System.out.println(ints);
        System.out.println(ints1);
    }

    public void selectionSort(List<Integer> values){
        int[] array = values.stream().mapToInt(Integer::intValue).toArray();

        for(int i=0;i<array.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<array.length;j++){
                    if(array[j] < array[min_index]){
                        min_index = j;
                    }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] =  temp;
        }
        Arrays.stream(array).forEach(System.out::println);

    }
}
