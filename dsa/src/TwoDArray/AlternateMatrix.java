package TwoDArray;

import java.util.*;

public class AlternateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter " + (n * n) + " elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i < n; i = i+2) {
            int temp = mat[i][0];
            mat[i][0] = mat[i][n - 1];
            mat[i][n - 1] = temp;
        }

        System.out.println("The resultant matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}