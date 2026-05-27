package Mathematics;
import java.util.*;

public class DecimalToOctal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        while(num != 0){
            list.add(num % 8);
            num = num/8;
        }

        Collections.reverse(list);

        for (int bit : list) {
            System.out.print(bit);
        }
    }
}
