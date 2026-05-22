package patterns;

public class HollowTrianglePattern {

    void hollowTriangle(int n){

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= 2 * n - 1; j++) {

                if (j == n - i + 1 ||
                        j == n + i - 1 ||
                        i == n) {

                    System.out.print("* ");

                } else {

                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        HollowTrianglePattern obj =
                new HollowTrianglePattern();

        obj.hollowTriangle(5);
    }
}