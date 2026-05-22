package numbers;

import java.util.Scanner;

public class FactorialUsingLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        int factorial = 1;

        for (int i = num; i > 0; i--) {

            factorial *= i;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}