package Arrays;

import java.util.Scanner;

public class gfgQuestions {

    public int findElementAtIndex(int i, int[] arr) {
        return arr[i];
    }

    public static void arrayTraversal(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int largest(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    class Solution {
        public int[] countOddEven(int[] arr) {
            int evenCount = 0;
            int oddCount = 0;

            int[] res = new int[2];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            res[0] = oddCount;
            res[1] = evenCount;

            return res;
        }
    }

    // Main Function
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 48, 13, 22};

        gfgQuestions obj = new gfgQuestions();

        // Find element at index
        int index = 2;
        System.out.println("Element at index " + index + ": "
                + obj.findElementAtIndex(index, arr));

        // Array traversal
        System.out.print("Array Traversal: ");
        arrayTraversal(arr);

        // Largest element
        System.out.println("Largest Element: " + largest(arr));

        // Count odd and even
        Solution sol = obj.new Solution();

        int[] result = sol.countOddEven(arr);

        System.out.println("Odd Count: " + result[0]);
        System.out.println("Even Count: " + result[1]);
    }
}