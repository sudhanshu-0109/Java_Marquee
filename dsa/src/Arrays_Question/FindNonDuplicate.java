package Arrays_Question;

public class FindNonDuplicate {

    public static void main(String[] args){
        int arr[] = {10, 20, 20, 10, 30, 40, 30};

        int result = 0;

        for (int num : arr) {
            result ^= num;  // XOR operation
        }

        System.out.println("Non-duplicate element: " + result);
    }

//    public static void main(String[] args) {
//        int arr[] = {10, 20, 20, 10, 30, 40, 30};
//
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//
//            if (count == 1) {
//                System.out.println(arr[i]);
//            }
//        }
//    }
}
