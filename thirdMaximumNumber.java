package LeetCode_Questions;

public class thirdMaximumNumber {
    class Solution {
        public int thirdMax(int[] nums) {
            int n = nums.length;

            // 1️⃣ Find max
            int max = nums[0];
            for (int i = 0; i < n; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }

            // 2️⃣ Find second max
            boolean FoundSMax = false;
            int sMax = nums[0];
            for (int i = 0; i < n; i++) {
                if (nums[i] != max) {
                    if (!FoundSMax || nums[i] > sMax) {
                        sMax = nums[i];
                        FoundSMax = true;
                    }
                }
            }

            // 3️⃣ Find third max
            boolean FoundTMax = false;
            int tMax = nums[0];
            for (int i = 0; i < n; i++) {
                if (nums[i] != max && nums[i] != sMax) {
                    if (!FoundTMax || nums[i] > tMax) {
                        tMax = nums[i];
                        FoundTMax = true;
                    }
                }
            }

            // 4️⃣ Return result
            return FoundTMax ? tMax : max;
        }
    }

}
