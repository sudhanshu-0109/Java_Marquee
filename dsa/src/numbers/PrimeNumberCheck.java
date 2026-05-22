package numbers;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int n = sc.nextInt();

        int i = 2;

        boolean isPrime = true;

        if (n <= 1) {

            isPrime = false;
        }

        while (i <= n / 2) {

            if (n % i == 0) {

                isPrime = false;

                break;
            }

            i++;
        }

        if (isPrime) {

            System.out.println("Prime");

        } else {

            System.out.println("Not Prime");
        }

        sc.close();
    }
}
