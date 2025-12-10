package LeetCode_Questions;
import java.util.*;
public class three_Sum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n=nums.length;
            Set<List<Integer>>ans=new HashSet<>();
            for(int i=0;i<n;i++){
                HashSet<Integer>hs=new HashSet<>();
                for(int j=i+1;j<n;j++){
                    int third=-(nums[i] + nums[j]);
                    if(hs.contains(third)){
                        List<Integer>temp=Arrays.asList(nums[i],nums[j],third);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                    hs.add(nums[j]);
                }
            }
            return new ArrayList<>(ans);
        }
    }
}
