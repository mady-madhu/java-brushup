package org.example.logics;

public class CountCharsInString {

    public static void main(String[] args) {
        String str = "aabb";
        String countedString = getCountedString(str);
        System.out.println(countedString);

    }

    public static String getCountedString(String str){

        StringBuilder sb = new StringBuilder();
        int count=0;
        Character currentChar = str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==currentChar){
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count=1;
            }
        }
        sb.append(currentChar).append(count);

        return sb.toString();
    }

}
