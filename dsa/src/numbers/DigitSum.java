package numbers;

public class DigitSum {

    public static void main(String[] args) {

        int num = 3232;

        int sum = 0;

        while (num > 0) {

            sum += num % 10;

            num = num / 10;
        }

        System.out.println("Digit Sum = " + sum);
    }
}