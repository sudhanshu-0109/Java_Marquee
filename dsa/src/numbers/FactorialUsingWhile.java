package numbers;

import java.util.Scanner;

public class FactorialUsingWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int num = sc.nextInt();

        int factorial = 1;

        while (num > 0) {

            factorial *= num;

            num--;
        }

        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}