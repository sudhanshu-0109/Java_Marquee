package basics;

public class NestedClassDemo {

    static class Hi {
        int a = 24;

        void add() {
            System.out.println(2 + 4);
        }
    }

    static class Hello {
        int b = 25;

        void sub() {
            System.out.println(5 - 3);
        }
    }

    public static void main(String[] args) {

        Hello h1 = new Hello();
        System.out.println(h1.b);
        h1.sub();

        Hi h2 = new Hi();
        System.out.println(h2.a);
        h2.add();
    }
}
