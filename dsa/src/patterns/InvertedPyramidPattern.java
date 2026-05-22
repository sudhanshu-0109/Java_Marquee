package patterns;

public class InvertedPyramidPattern {

    void reversePyramid(int n){

        for(int i = 0 ; i < n; i++){

            for(int j = 0; j < i; j++){

                System.out.print(" ");
            }

            for(int k = 0; k < n-i; k++){

                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        InvertedPyramidPattern obj =
                new InvertedPyramidPattern();

        obj.reversePyramid(4);
    }
}