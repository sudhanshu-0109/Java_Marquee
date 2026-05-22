package patterns;

public class NumberTrianglePattern {

    void pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {

                System.out.print(j + 1 + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        NumberTrianglePattern obj = new NumberTrianglePattern();

        obj.pattern(4);
    }
}