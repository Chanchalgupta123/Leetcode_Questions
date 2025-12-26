package LeetCode_Questions;

public class minimum_penality_for_shop {
    class Solution {
        public int bestClosingTime(String customers) {
            int n = customers.length();

            // prefix[i] = number of 'N' from 0 to i-1 (penalty for being open)
            int[] prefix = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                prefix[i] = prefix[i - 1];
                if (customers.charAt(i - 1) == 'N') {
                    prefix[i]++;
                }
            }

            // suffix[i] = number of 'Y' from i to n-1 (penalty for being closed)
            int[] suffix = new int[n + 1];
            for (int i = n - 1; i >= 0; i--) {
                suffix[i] = suffix[i + 1];
                if (customers.charAt(i) == 'Y') {
                    suffix[i]++;
                }
            }

            int minPenalty = Integer.MAX_VALUE;
            int bestTime = 0;

            for (int i = 0; i <= n; i++) {
                int penalty = prefix[i] + suffix[i];
                if (penalty < minPenalty) {
                    minPenalty = penalty;
                    bestTime = i;
                }
            }

            return bestTime;
        }
    }

}
