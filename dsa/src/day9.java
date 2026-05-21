public class day9 {
    void pattern1(int n){
        // code here
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){

                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
    void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(i);
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    void pattern3(int n){
        // code here
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){

                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
    void pattern4(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
    void pattern5(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    void pattern6(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern7(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern8(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                if((i+j) % 2 == 0){
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }
    }
    void pattern9(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }

    void multiply(int a, int b){
        System.out.println(a * b);
    }
    void main() {
//        pattern1(4);
//        System.out.println();
//        pattern2(4);
//        System.out.println();
//        pattern3(4);
//        System.out.println();
//        pattern4(4);
//        System.out.println();
//        pattern5(4);
//        System.out.println();
//        pattern6(4);
//        System.out.println();
//        pattern7(4);
//        System.out.println();
//        pattern8(4);
//        System.out.println();
//        pattern9(5);
//        System.out.println();
        multiply(5, 3);
    }
}
