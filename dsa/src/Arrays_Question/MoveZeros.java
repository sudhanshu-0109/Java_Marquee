package Arrays_Question;

public class MoveZeros {
        public void moveZeroes(int[] nums) {
            int j = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }

     void main() {
     int[] arr = {
             0,1,0,3,12
     };

     moveZeroes(arr);
    }
}
