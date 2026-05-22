package numbers;

import java.util.Scanner;

public class GCDCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");

        int a = sc.nextInt();

        System.out.print("Enter second number: ");

        int b = sc.nextInt();

        int gcd = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {

            if (a % i == 0 && b % i == 0) {

                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);

        sc.close();
    }
}