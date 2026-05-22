package numbers;

public class DigitSquareSum {

    public static void main(String[] args) {

        int num = 153;

        int sum = 0;

        while (num != 0) {

            int digit = num % 10;

            sum += digit * digit;

            num /= 10;
        }

        System.out.println("Digit square sum = " + sum);
    }
}