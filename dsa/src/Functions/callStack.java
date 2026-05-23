package Functions;

public class callStack {
    public static int add1(int a, int b){
        System.out.println("------------------");
        System.out.println("Add 1 Called");
        int result2 = add2(2,3,5);
        System.out.println(result2);
        System.out.println("Add 1 Finished.......");
        return a+b;
    }

    public static int add2(int a, int b, int c){
        System.out.println("Add 2 Called");
        System.out.println("-------------------");
        System.out.println("Add 2 Finished.........");
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("Main Call Huaaaa");
        add1(2, 4);
        System.out.println("Main Ended........");
    }
}
