/* import java.util.Scanner;

public class day7 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month !!! write 1-12 only ....");
        }

        String role = sc.next();
        switch (role) {
            case "admin":
                System.out.println("This is admin page");
                break;
            case "teacher":
                System.out.println("This is teacher page");
                break;
            case "student":
                System.out.println("This is student page");
                break;
            case "guest":
                System.out.println("This is guest page");
            default:
                System.out.println("Select a valid role !!!");
        }


        int sum = 0;
        for (int i = 0; i <= 30; i++){ // whole numbers (0-30)
            if(i % 2 == 0) sum += i;
        }
        System.out.println(sum);


        int battery = 10;
        int minutes = 0;
        while(battery != 100){
            battery += 10;
            minutes++;
        }
        System.out.println("time taken to fully charge : " + minutes + " minutes");


        int num = sc.nextInt();
        int res = 1;
        while(num > 0){
            res *= num;
            num--;
        }
        System.out.println(res);


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

    }


            int num = sc.nextInt();
            int org = num;
            int rev = 0;
            while(num != 0){
                int dig = num % 10;
                rev = rev * 10 + dig;
                num = num / 10;
            }
            System.out.println(rev);
            if(rev == org) {
                System.out.println("Palindrome");
            } else {
                System.out.println(("Not Palindrome"));
            }
} */
import java.util.Scanner;
public class day7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            int gcd = 1;
            for(int i = 1; i <= Math.min(a, b); i++){
                if(a % i == 0 && b % i == 0){
                    gcd = i;
                }
            }
           System.out.println(gcd);
        }
    }
