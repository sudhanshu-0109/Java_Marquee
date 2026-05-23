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

    void dynamicStairCase(int n, int stars){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i % 2 == 0){
                stars += 2;
            }
        }
    }

    public static void main(String[] args) {

        StaircasePattern obj = new StaircasePattern();
//        obj.stairCase(3);
        obj.dynamicStairCase(6, 2);
    }
}