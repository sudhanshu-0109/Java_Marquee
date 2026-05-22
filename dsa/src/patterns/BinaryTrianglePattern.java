package patterns;

public class BinaryTrianglePattern {

    void pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i + 1; j++) {

                if ((i + j) % 2 == 0) {

                    System.out.print("0 ");

                } else {

                    System.out.print("1 ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        BinaryTrianglePattern obj = new BinaryTrianglePattern();

        obj.pattern(4);
    }
}
