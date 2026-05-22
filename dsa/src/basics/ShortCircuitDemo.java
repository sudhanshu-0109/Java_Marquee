package basics;

public class ShortCircuitDemo {

    public static void main(String[] args) {

        int a = 3;

        if (a * 2 > 5 || a / 0 > 1) {
            System.out.println("safe");
        }

        // Second condition never executes
        // because first condition is already true
    }
}