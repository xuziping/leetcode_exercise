package array;

import java.util.Arrays;

public class Q1051 {

    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int ret = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                ret++;
            }
        }
        return ret;
    }
}
