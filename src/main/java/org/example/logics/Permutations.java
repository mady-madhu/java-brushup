package org.example.logics;

public class Permutations {

    public static void main(String[] args) {
        String str = "abc ";
        String ch = "";

        permutations(str, ch);
    }

    public static void permutations(String str, String ch) {

        if (str.isEmpty()) {
            System.out.println(ch);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String answer = left + right;
            permutations(answer, c + ch);
        }
    }
}
