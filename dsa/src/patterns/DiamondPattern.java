package patterns;

public class DiamondPattern {

    void mergedPyramid(int n){

        for(int i = 0; i < n/2 + 1 ; i++) {

            for (int j = 0; j < (n/2 + 1)-i-1; j++) {

                System.out.print(" ");
            }

            for (int k = 0; k < i+1; k++) {

                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = 0; i < n/2 + 1; i++){

            for(int j = 0; j < i; j++){

                System.out.print(" ");
            }

            for(int k = 0; k < (n/2 + 1) - i; k++){

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        DiamondPattern obj =
                new DiamondPattern();

        obj.mergedPyramid(5);
    }
}