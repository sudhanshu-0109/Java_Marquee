package Arrays;

import java.util.Scanner;

public class CheckEvenArray {

    void checkEven(int n){
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++){
            if(arr[j] % 2 == 0) {
                System.out.print(arr[j] + " ");
            }
        }
    }
    public static void main(String[] args){
        CheckEvenArray ck = new CheckEvenArray();
        ck.checkEven(5);
    }
}
