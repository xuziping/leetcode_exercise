package array;

public class Q1266 {

    public int minTimeToVisitAllPoints(int[][] points) {
        int ret = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int d1 = points[i + 1][0] - points[i][0];
            int d2 = points[i + 1][1] - points[i][1];
            ret += Math.max(Math.abs(d1), Math.abs(d2));
        }
        return ret;
    }
}
