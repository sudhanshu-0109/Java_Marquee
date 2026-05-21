import java.util.Scanner;

public class day8 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
/*        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i*i;
        }
        System.out.println(sum);

        int num = 153;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit*digit;
            num /= 10;
        }
        System.out.println(sum);

        // armstrong number
        int num = 153;
        int org = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit*digit*digit;
            num /= 10;
        }
        if(sum == org)
            System.out.println("Yes Armstrong");
        else
            System.out.println("not an Armstrong");
        // Print perfect square between two numbers :
        int low = sc.nextInt();
        int high = sc.nextInt();
        int i = 1;
        int count = 0;
        while(i*i < high){
            if(i*i > low){
                System.out.print(i*i + " ");
                System.out.println();
                count++;
            }
            if(i*i > high) break;
            i++;
        }
        System.out.println(count);  */

        // fibonnaci series :
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for(int i = 2; i <= n; i++){
            int next = first+second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
