package Arrays;
import java.util.*;

public class linearSearch {

    static int search(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static boolean found(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter "+ size + " elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target: ");
        int target = sc.nextInt();

        int index = search(arr, target);
        System.out.println("Index: " + index);

        boolean isFound = found(arr, target);
        System.out.println("Found: " + isFound);
    }
}