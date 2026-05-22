package patterns;

public class AlphabetReversePattern {

    void alphaBet(int n){

        for(int i = 0; i < n; i++) {

            for (int j = 0; j <= n-i-1; j++) {

                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        AlphabetReversePattern obj =
                new AlphabetReversePattern();

        obj.alphaBet(5);
    }
}