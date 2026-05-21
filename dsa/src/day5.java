import java.util.*;

public class day5 {

//    static class Hi {
//        int a = 24;
//        void add(){
//            System.out.println(2+4);
//        }
//    }
//
//    static class Hello {
//        int b = 25;
//        void sub(){
//        System.out.println(5-3);
//        }
//    }

    public static void main(String[] args) {
//        Hello h1 = new Hello();
//        System.out.println(h1.b);
//        h1.sub();
//
//        Hi h2 = new Hi();
//        System.out.println(h2.a);
//        h2.add();
//
//        char ch = 'a';
//        System.out.println(ch++);

//       final byte b1 = 10;
//       final byte b2 = 30;
//        byte b3 = b1+b2;
//        System.out.println(b3);
// final will help to fix the value to the byte,
// and if we do not use the final keyword then it will be taken as integer by the java


//        byte c1 = -128;
//        c1--;
//        System.out.println(c1);
//        // works as a loop, after reaching the end from both the sides...

//        | Implicit Typecasting                 | Explicit Typecasting                 |
//| ------------------------------------ | ------------------------------------ |
//| Done automatically by Java           | Done manually by programmer          |
//| Converts smaller type to bigger type | Converts bigger type to smaller type |
//| No data loss                         | Data loss may happen                 |
//| Safe conversion                      | Risky conversion                     |
//| Also called Widening                 | Also called Narrowing                |

//        int a = 65;
//        a++;
//        char ch = (char)a;
//        System.out.println(ch);

//        int a = 3;
//        if(a* 2 > 5 || a / 0 > 1 )
//            System.out.println("safe");

//        What is ternary operator ?
//        a ternary operator is a replacement of the if, else block, basically
//        it a short form where if else is covered within a line...

//        int a = 10;
//        int b = 5;
//        int c = 2;
//        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
//        System.out.println(max);

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        String vote = (age >= 18)? "You can vote" : "You can't Vote";
//        System.out.println(vote);




//        char a = 'a';
//        a++;
//        System.out.println(--a);
//        ++a;
//        a++;
//        System.out.println(a+10);

//        int a = 1;
//        int b = a++ + ++a + a++ + a;
//        System.out.println(b);
//
//        int x = 5;
//        System.out.println(x++ + ++x * x++);
//
//        int z = 1;
//        System.out.println(++z + z++ + --z + z--);

//        int day = sc.nextInt();
//        switch(day) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println(("tuesday"));
//                break;
//            case 3:
//                System.out.println(("wednesday"));
//                break;
//            case 4:
//                System.out.println(("thursday"));
//                break;
//            case 5:
//                System.out.println(("friday"));
//                break;
//            case 6:
//                System.out.println(("saturday"));
//                break;
//            case 7:
//                System.out.println(("sunday"));
//                break;
//            default:
//                System.out.println("Invalid Input");
//        }

        int num = sc.nextInt();
        int count = 0;
        while(num % 2 == 0){
            num = sc.nextInt();
            count++;
        }
        System.out.println(count+1);
    }
}
