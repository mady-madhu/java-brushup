package org.example.window;

public class MaximumSumOfSubarray {

    public static int findMaxSumSubarray(int[] arr, int k) {

        int maxSum = 0;
        int windowSum = 0;
        int windowStart = 0;

        // Calculate the sum of the first window
        for(int i=0; i<k;i++){
            windowSum +=arr[i];
        }
        maxSum = windowSum;

        // Slide the window across the rest of the array
        for(int windowEnd=k; windowEnd<arr.length;windowEnd++){
            // Add the new element entering the window
            windowSum +=arr[windowEnd];
            // Subtract the element leaving the window
            windowSum -=arr[windowStart];
            // Slide the window forward
            windowStart++;
            // Update the maximum sum found so far
            maxSum = Math.max(windowSum,maxSum);
        }

        return maxSum;

    }


    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum sum of a subarray of size " + k + ": " + findMaxSumSubarray(arr, k)); // Output: 9 (from [5, 1, 3])
    }
}
