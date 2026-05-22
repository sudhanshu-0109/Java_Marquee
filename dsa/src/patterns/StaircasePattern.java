package patterns;

public class StaircasePattern {

    void stairCase(int n){

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= 2; k++) {

                for (int j = 1; j <= i; j++) {

                    System.out.print("**");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        StaircasePattern obj =
                new StaircasePattern();

        obj.stairCase(3);
    }
}