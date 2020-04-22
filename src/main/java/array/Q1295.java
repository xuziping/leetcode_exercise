package array;

public class Q1295 {

    public int findNumbers(int[] nums) {
        if (null == nums || nums.length == 0 || nums.length > 500) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 1 && nums[i] <= 100000) {
                if (("" + nums[i]).length() % 2 == 0) {
                    total++;
                }
            }
        }
        return total;
    }
}
