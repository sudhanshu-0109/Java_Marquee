package patterns;

public class RowColumnPattern {

    void pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(i);
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        RowColumnPattern obj = new RowColumnPattern();

        obj.pattern(4);
    }
}