package numbers;
import java.util.Scanner;

public class SumOfSquares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {

            sum += i * i;
        }

        System.out.println("Sum of squares = " + sum);

        sc.close();
    }
}
