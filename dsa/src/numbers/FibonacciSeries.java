package numbers;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");

        int n = sc.nextInt();

        int first = 0;

        int second = 1;

        System.out.println("Fibonacci Series:");

        if (n >= 1) {

            System.out.println(first);
        }

        if (n >= 2) {

            System.out.println(second);
        }

        for (int i = 3; i <= n; i++) {

            int next = first + second;

            System.out.println(next);

            first = second;

            second = next;
        }

        sc.close();
    }
}
