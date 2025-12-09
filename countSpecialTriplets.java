package LeetCode_Questions;
import java.util.*;
public class countSpecialTriplets {
    class Solution {
        private static final long MOD = 1_000_000_007L;

        public int specialTriplets(int[] nums) {
            int n = nums.length;
            long count = 0L;

            Map<Integer, Integer> right = new HashMap<>();
            Map<Integer, Integer> left = new HashMap<>();

            for (int x : nums) right.put(x, right.getOrDefault(x, 0) + 1);

            for (int j = 0; j < n; j++) {
                int val = nums[j];
                int rc = right.get(val) - 1;
                if (rc == 0) right.remove(val);
                else right.put(val, rc);
                long needLL = 2L * val;
                if (needLL >= Integer.MIN_VALUE && needLL <= Integer.MAX_VALUE) {
                    int need = (int) needLL;
                    long leftCount = left.getOrDefault(need, 0);
                    long rightCount = right.getOrDefault(need, 0);
                    count = (count + (leftCount * rightCount) % MOD) % MOD;
                }
                left.put(val, left.getOrDefault(val, 0) + 1);
            }

            return (int) count;
        }
    }

}
