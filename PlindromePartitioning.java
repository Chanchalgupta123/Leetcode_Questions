package LeetCode_Questions;
import java.util.*;
public class PlindromePartitioning {


    class Solution {
        public void func(int ind, String s, List<List<String>> res, List<String> path) {
            if (ind == s.length()) {
                res.add(new ArrayList<>(path));
                return;
            }
            for (int i = ind; i < s.length(); i++) {
                if (isPalindrome(s, ind, i)) {          // <-- fixed: removed stray semicolon & added block
                    path.add(s.substring(ind, i + 1));
                    func(i + 1, s, res, path);
                    path.remove(path.size() - 1);
                }
            }
        }

        public boolean isPalindrome(String s, int start, int end) {
            while (start < end) {                        // start < end is slightly more idiomatic
                if (s.charAt(start++) != s.charAt(end--)) return false;
            }
            return true;
        }

        public List<List<String>> partition(String s) {
            List<List<String>> res = new ArrayList<>();
            func(0, s, res, new ArrayList<>());
            return res;
        }
    }

}
