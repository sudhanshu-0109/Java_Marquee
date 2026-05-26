package Mathematics;
import java.util.*;

public class combination {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int min = Math.min(r, n - r);

        long res = 1;

        for (int i = 0; i < min; i++) {
            res = res * (n - i) / (i + 1);
        }

        System.out.println(res);
    }
}