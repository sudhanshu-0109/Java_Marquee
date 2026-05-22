package patterns;

public class NumberRepeatPattern {

    void pattern2(int n){

        for(int i = 0; i < n; i++){

            for(int j = 0; j < i+1; j++){

                System.out.print(i);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        NumberRepeatPattern obj =
                new NumberRepeatPattern();

        obj.pattern2(5);
    }
}