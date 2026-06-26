package Arrays;

public class OddEvenInArray {
    public static void main() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int evencount = 0, oddcount=0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evencount++;
            } else {
                oddcount++;
            }
        }
        System.out.println("even count: " + evencount);
        System.out.println("odd count: " + oddcount);
    }
}
