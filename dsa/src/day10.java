public class day10 {
    void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    void pyramidPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
    void reversePyramid(int n){
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < n-i; k++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
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
    void alphaBet(int n){
            for(int i = 0; i < n; i++) {
                for (int j = 0; j <= n-i-1; j++) {
                    System.out.print((char) ('A' + j));
                }
                System.out.println();
            }
    }
    void main() {
//        pattern1(5);
//        pattern2(5);
//        pyramidPattern(6);
//        System.out.println();
//        reversePyramid(6);
        mergedPyramid(5);
    }
}
