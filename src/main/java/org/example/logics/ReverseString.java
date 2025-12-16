package org.example.logics;

public class ReverseString {

    public static void main(String[] args) {
        String str = "hello";
        String string = reverseWithoutBuffer(str);
        System.out.println(string);
    }

    public static String reverseWithBuffer(String[] args) {
        String str = "hello";
        StringBuilder ab = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            ab.append(str.charAt(i));
        }
        return ab.toString();
    }


    public static String reverseWithoutBuffer(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

}
