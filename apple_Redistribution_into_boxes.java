package LeetCode_Questions;

import java.util.Arrays;

public class apple_Redistribution_into_boxes {
    class Solution {
        public int minimumBoxes(int[] apple, int[] capacity) {
            int n=apple.length;
            int m=capacity.length;
            int appleSum=0;
            for(int i=0;i<n;i++){
                appleSum=appleSum + apple[i];
            }
            Arrays.sort(capacity);
            int left=0 ,right=m-1;
            while(left<right){
                int temp=capacity[left];
                capacity[left]=capacity[right];
                capacity[right]=temp;
                left++;
                right--;
            }
            int i=0 , capSum=0 ,count=0;
            while(i<m){
                capSum=capSum+capacity[i];
                if(capSum>=appleSum){
                    count++;
                    break;
                }
                count++;
                i++;
            }
            return count;
        }
    }
}
