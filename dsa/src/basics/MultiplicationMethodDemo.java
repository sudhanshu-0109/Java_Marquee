package basics;

public class MultiplicationMethodDemo {

    void multiply(int a, int b) {

        System.out.println("Multiplication = " + (a * b));
    }

    public static void main(String[] args) {

        MultiplicationMethodDemo obj =
                new MultiplicationMethodDemo();

        obj.multiply(5, 3);
    }
}