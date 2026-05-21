import java.util.Scanner;

public class day6 {
/*  why java is robust and portable : Java is highly robust and secure because
   it eliminates error-prone memory pointers,
   manages memory automatically, and enforces strict type-checking.
   java is portable because of its platform independency.
   memory_management
   portability
   type_checking
   security
 */
public static void main() {
    Scanner sc = new Scanner(System.in);
/*    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the operator: ");
    char ch = sc.next().charAt(0);
    System.out.print("Enter first operand: ");
    int a = sc.nextInt();
    System.out.print("Enter second operand: ");
    int b = sc.nextInt();
    switch(ch){
        case '+':
            System.out.println("Result: " + a+b);
            break;
        case '-':
            System.out.println("Result: " + (a-b));
            break;
        case '*':
            System.out.println("Result: " + a*b);
            break;
        case '/':
            if(b == 0){
                System.out.println("Division by zero disposible !");
                break;
        } else {
                System.out.println("Result: " + a / b);
                break;
            }
        case '%':
            System.out.println("Result: " + a%b);
            break;
        default:
            System.out.println("Invalid input");
        } */
//        for(int i = 1; i <= 10; i++){
//                System.out.println("3 * " + i + " = " + i*3);
//            }
//        int a = 1;
//        while(a <= 10){
//            System.out.println("3 * " + a + " = " + a*3);
//            a++;
//        }

//    int a = 3232;
//    int sum = 0;
//    while(a > 0){
//        sum += a%10;
//        a = a/10;
//    }
//    System.out.println(sum);

    int num = sc.nextInt();
    int res = 1;
    for (int i = num; i > 0; i--){
         res *= i;
    }
    System.out.println(res);
}
    }
