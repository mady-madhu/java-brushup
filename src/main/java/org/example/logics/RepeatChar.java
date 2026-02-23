package org.example.logics;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class RepeatChar {

    /**
     *   * Finds the first character that does not repeat anywhere in the input string
     *   * Given "apple", the answer is "a"
     *   * Given "racecars", the answer is "e"
     *  **/
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


        char repeated = findFirstRepeated(str);
        System.out.println(repeated);
    }


    public static  char findFirstRepeated(String s) {
        boolean[] seen = new boolean[256]; // Assuming ASCII character set

        //System.out.println(new ArrayList<>(seen));
        Arrays.asList(seen).stream().forEach(System.out::println);
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (seen[currentChar]) {
                return currentChar; // Found the first repeated character
            } else {
                seen[currentChar] = true; // Mark as seen
            }
        }
        return '\0'; // Return null char or throw error if no repeat found
    }

}
