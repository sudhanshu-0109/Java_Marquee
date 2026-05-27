package Mathematics;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int base = 1;
        int decimal = 0;

        while(num > 0){
            int dig = num % 10;

            if (dig > 7) {
                System.out.println("Invalid Octal Number");
                return;
            }

            decimal += dig * base;

            base *= 8;
            num /= 10;
        }

        System.out.println(decimal);
    }
}