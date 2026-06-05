package Arrays;

public class arraySumIndex {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 4, 5, 8};
        int k = 4;

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != k){
                sum += arr[i];
            } else {
                continue;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[j] == k){
                arr[j] = sum;
            }
            else{
                arr[j] = 0;
            }

            System.out.print(arr[j] + " ");
        }
    }
}
