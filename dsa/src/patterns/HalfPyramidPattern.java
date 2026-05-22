package patterns;

public class HalfPyramidPattern {

    void pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HalfPyramidPattern obj = new HalfPyramidPattern();

        obj.pattern(4);
    }
}