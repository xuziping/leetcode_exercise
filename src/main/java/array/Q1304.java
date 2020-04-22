package array;

public class Q1304 {

    public int[] sumZero(int n) {

        int ret[] = new int[n];
        if (n%2==0) {
            for(int i=0; i<n/2; i++) {
                ret[i] = i+1;
                ret[n/2+i] = -ret[i];
            }
        } else {
            ret[0] = 0;
            for (int i=1; i<=n/2; i++) {
                ret[i] = i;
                ret[n/2+i] = -ret[i];
            }
        }
        return ret;
    }
}
