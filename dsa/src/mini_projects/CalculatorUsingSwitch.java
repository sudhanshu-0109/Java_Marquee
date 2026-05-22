package mini_projects;

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter operator (+, -, *, /, %): ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (ch) {

            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':

                if (b == 0) {
                    System.out.println("Division by zero not possible");
                } else {
                    System.out.println("Result = " + (a / b));
                }

                break;

            case '%':
                System.out.println("Result = " + (a % b));
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}
