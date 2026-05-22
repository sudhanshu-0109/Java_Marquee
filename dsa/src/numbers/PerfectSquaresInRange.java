package numbers;
import java.util.Scanner;

public class PerfectSquaresInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower limit: ");

        int low = sc.nextInt();

        System.out.print("Enter higher limit: ");

        int high = sc.nextInt();

        int i = 1;

        int count = 0;

        System.out.println("Perfect squares:");

        while (i * i <= high) {

            if (i * i >= low) {

                System.out.println(i * i);

                count++;
            }

            i++;
        }

        System.out.println("Total perfect squares = " + count);

        sc.close();
    }
}
