package org.example.sorting;

import java.util.Arrays;

public class SelectionSorting {

    public static void main(String[] args) {
        int[] values = new int[]{10,5,2,100};
        System.out.println(values.length);

        //go through each element except last element
        //because we are comparing each value  with remaining all values in second loop
        for(int i=0;i<values.length-1;i++){
            System.out.println(values[i]);
            int minIndex = i; // consider first index has minimum value
            for(int j=i+1;j<values.length;j++){
                int currentVal = values[j]; // store second loop value as currentValue for everytime
                if(currentVal < values[i]){// compare the currentvalue with first loop value
                    minIndex = j;          // change minimum index value if current value is smaller than first loop value
                }
            }
            if(minIndex !=i ){   // after exiting each i value comparison check is minIndex changed if its changed swap the values
                int temp = values[i];
                values[i] = values[minIndex];
                values[minIndex] = temp;
            }

        }

        Arrays.stream(values).forEach(System.out::println);

        /**
         *
         * Time complexity
         *
         * Outer loop runs (n − 1) times.
         *
         * Inner loop compares the remaining elements:
         *
         * (n−1)+(n−2)+...+1=n(n−1)/2
         * ⇒ O(n²) comparisons.
         * Space complexity
         *
         * Extra variables: minIdx, minVal, curVal, temp ⇒ constant space.
         * ⇒ O(1) auxiliary space.
         *
         */

    }
}
