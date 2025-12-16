package org.example.logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "eat", "tea", "tan", "ate", "nat", "bat"
        );

        List<List<String>> result = getAnagrams(words);
        for (List<String> group : result) {
            System.out.println(group);
        }
    }

    public static List<List<String>> getAnagrams(List<String> stringList){

        LinkedHashMap<String,List<String>> anagramMap= new LinkedHashMap<>();
        for(String str : stringList){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            anagramMap.computeIfAbsent(key,k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
