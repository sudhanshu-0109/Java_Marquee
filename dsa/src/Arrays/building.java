import java.util.*;

public class building {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        buildings(arr, n);
    }

    public static void buildings(int[] arr, int n) {

        int max = arr[0];

        // Find maximum height
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print building
        for (int i = 0; i < max; i++) {

            int top = max - i;

            for (int j = 0; j < n; j++) {

                if (arr[j] >= top) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }
}