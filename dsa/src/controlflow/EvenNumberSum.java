package controlflow;

public class EvenNumberSum {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 30; i++) {

            if (i % 2 == 0) {

                sum += i;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
