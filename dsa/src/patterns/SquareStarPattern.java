package patterns;

public class SquareStarPattern {

    void pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        SquareStarPattern obj = new SquareStarPattern();

        obj.pattern(4);
    }
}