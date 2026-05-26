package Mathematics;
import java.util.*;

public class decimalToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        while(num != 0){
            list.add(num % 2);
            num = num/2;
        }

        Collections.reverse(list);

        for (int bit : list) {
            System.out.print(bit);
        }
    }
}
