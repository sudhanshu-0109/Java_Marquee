package basics;

import java.util.Scanner;

public class TernaryOperatorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 5;
        int c = 2;

        int max = (a > b)
                ? (a > c ? a : c)
                : (b > c ? b : c);

        System.out.println("Maximum = " + max);

        System.out.print("Enter your age: ");

        int age = sc.nextInt();

        String vote = (age >= 18)
                ? "You can vote"
                : "You can't vote";

        System.out.println(vote);

        sc.close();
    }
}