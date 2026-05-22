package controlflow;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter numbers:");

        int num = sc.nextInt();

        while (num % 2 == 0) {

            count++;

            num = sc.nextInt();
        }

        System.out.println("Even numbers entered: " + count);

        sc.close();
    }
}