package array;

import java.util.Arrays;

public class Q0101 {

    public boolean isUnique(String astr) {
        if (astr == null || astr.length() == 0) {
            return true;
        }
        char[] chars = astr.toCharArray();
        Arrays.sort(chars);
        char previous = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if (previous == chars[i]) {
                return false;
            }
            previous = chars[i];
        }
        return true;
    }
}
