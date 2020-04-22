package array;

public class Q1299 {

    public int[] replaceElements(int[] arr) {

        int[] ret = new int[arr.length];
        ret[arr.length-1] = -1;
        int max = -1;
        if(arr.length>1) {
            for(int i=arr.length-2; i>=0; i--) {
                ret[i] = max = Math.max(max, arr[i+1]);
            }
        }
        return ret;
    }
}
