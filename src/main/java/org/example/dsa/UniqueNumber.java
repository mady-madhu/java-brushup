package org.example.dsa;

public class UniqueNumber {

    public static void main(String[] args) {
        int [] arr = {5,2,2,3,4};
        //System.out.println(0^2); //2
        //System.out.println(2^2); //0
        //System.out.println(1^2); //3


        int result = 0;

        // Iterate through each element and perform a bitwise XOR
        for (int num : arr) {
            result ^= num;
        }

        // The final value of result is the unique number
        System.out.println(result);

    }
}
