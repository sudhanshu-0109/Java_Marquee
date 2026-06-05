1. max consecutive bits




public class MaxConsicutiveBits {
public int maxConsecBits(int[] arr) {

        if(arr.length == 0) return 0;

        int count = 1;
        int maxCount = 1;

        int i = 0;
        int j = 1;

        while(j < arr.length) {
            if(arr[i] == arr[j]) {
                count++;
            } else {
                count = 1;
            }

            maxCount = Math.max(maxCount, count);

            i++;
            j++;
        }

        return maxCount;
    }




2. move zeros to the end :

class Solution {
public void moveZeroes(int[] nums) {
int i = 0,
j = nums.length-1;
while(i < j){
if(nums[i] != 0){
i++;
}
else{
int temp = nums[j];
nums[j] = nums[i];
nums[i] = temp;
i++;
j--;
}
}
for(int k = 1; k <= j; k++){
if(nums[k-1] > nums[k]){
int temp = nums[k];
nums[k] = nums[k-1];
nums[k-1] = temp;
}
}
}
}


3. count pair divisible by k



class Solution {
public int countKdivPairs(int[] nums, int k) {
// code here

                int count = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if((nums[i] + nums[j]) % k == 0) {
                    count++;
                }
            }
        }

        return count;
        
    }
}


