package org.example.logics;

import java.util.LinkedHashMap;

public class RepeatChar {

    /**
     * /**
     *   * Finds the first character that does not repeat anywhere in the input string
     *   * Given "apple", the answer is "a"
     *   * Given "racecars", the answer is "e"
     *   **/
    public static void main(String[] args) {
        String str = "racecars";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
       for(char c: str.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }
       map.entrySet().stream()
               .filter(entry -> entry.getValue() ==1)
               .map(e -> e.getKey()).findFirst()
               .ifPresent(System.out::println);
    }
}
