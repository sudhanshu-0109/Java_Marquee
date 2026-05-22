package basics;

public class IncrementOperators {

    public static void main(String[] args) {

        char ch = 'a';
        System.out.println(ch++);

        char a = 'a';
        a++;

        System.out.println(--a);

        ++a;
        a++;

        System.out.println(a + 10);

        int x = 5;
        System.out.println(x++ + ++x * x++);

        int z = 1;
        System.out.println(++z + z++ + --z + z--);
    }
}
