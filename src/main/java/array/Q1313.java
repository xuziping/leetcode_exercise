package array;

import java.util.ArrayList;
import java.util.List;

public class Q1313 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] ret = new Q1313().decompressRLElist(nums);
        for (int i = 0; i < ret.length; i++) {
            System.out.println(ret[i]);
        }
    }

    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length; ) {
            for (int times = 1; times <= nums[i]; times++) {
                list.add(nums[i + 1]);
            }
            i = i + 2;
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i).intValue();
        }
        return ret;
    }
}
