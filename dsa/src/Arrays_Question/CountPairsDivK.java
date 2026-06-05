package Arrays_Question;
import java.util.*;
public class CountPairsDivK {
    public long countPairs(int[] nums, int k) {
        long count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] * nums[j]) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // size of array
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        CountPairsDivK sol = new CountPairsDivK();
        long result = sol.countPairs(nums, k);

        System.out.println(result);

        sc.close();
    }
}

