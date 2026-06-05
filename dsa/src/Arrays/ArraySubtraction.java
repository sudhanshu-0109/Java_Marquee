package Arrays;

public class ArraySubtraction {
    public static void main(String[] args){
        int[] a = {1, 2, 3};
        int[] b = {1, 0, 7};
        int[] c = new int[a.length];

        int i = a[a.length-1];
        int j = b[b.length-1];
        int k = c[c.length-1];

        while(i >= 0 || j >= 0 ){
            if(i >= j){
                c[k] = a[i]-b[j];
                i--;
                j--;
            }else {
                a[i] += 10;
                a[i - 1] -= 1;

                c[k] = a[i]-b[j];
                j--;
                i--;
            }
        }
    }
}
