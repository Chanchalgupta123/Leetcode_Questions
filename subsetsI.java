package LeetCode_Questions;

import java.util.*;

public class subsetsI {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            ArrayList<Integer>current=new ArrayList<>();
            List<List<Integer>>result=new ArrayList<>();
            generateSubset(0,nums,current,result);
            return result;
        }
        public static void generateSubset(int i,int nums[],ArrayList<Integer>current,List<List<Integer>>result){
            if(i==nums.length){
                result.add(new ArrayList<>(current));
                return;
            }
            current.add(nums[i]);
            generateSubset(i+1,nums,current,result);
            //backtrack
            current.remove(current.size()-1);
            generateSubset(i+1,nums,current,result);
        }
    }



}
