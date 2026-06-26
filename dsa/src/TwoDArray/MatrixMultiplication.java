package TwoDArray;

import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Matrix 1: ");
        int m = sc.nextInt();

        System.out.print("Enter columns of Matrix 1: ");
        int n = sc.nextInt();

        System.out.print("Enter rows of Matrix 2: ");
        int a = sc.nextInt();

        System.out.print("Enter columns of Matrix 2: ");
        int b = sc.nextInt();

        if (n != a) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] mat1 = new int[m][n];
        int[][] mat2 = new int[a][b];

        System.out.println("Enter " + (m * n) + " elements of Matrix 1:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter " + (a * b) + " elements of Matrix 2:");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[m][b];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < n; k++) {
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}