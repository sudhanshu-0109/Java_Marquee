package Arrays_Question;

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

     void main() {
        int[] arr = {
                0,1,0,0,0,0,1
        };

        maxConsecBits(arr);

    }
}
