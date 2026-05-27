package Arrays;
import java.util.*;
public class basics {
    public static void main(String[] args){
/*        int[] arr;  //declaration
              arr = new int[5];
        int[] brr = {1,2,3,4,5,6};  //initialisation
*/

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < size; j++){
            System.out.print(array[j] + " ");
        }
    }
}
