package array;

import java.util.ArrayList;
import java.util.List;

public class Q1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
