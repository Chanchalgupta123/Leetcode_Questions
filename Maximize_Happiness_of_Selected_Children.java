package LeetCode_Questions;
import java.util.*;
public class Maximize_Happiness_of_Selected_Children {
    class Solution {
        public long maximumHappinessSum(int[] happiness, int k) {
            int n=happiness.length;
            long ans=0;
            int turn=0;
            Arrays.sort(happiness);
            int left=0 , right=n-1;
            while(left<=right){
                int temp=happiness[left];
                happiness[left]=happiness[right];
                happiness[right]=temp;
                left++;
                right--;
            }
            for(int i=0;i<n;i++){
                if(k<=0){
                    break;
                }
                if(happiness[i]-turn<0){
                    happiness[i]=0;
                    ans=ans+happiness[i];
                }
                else{
                    ans=ans+happiness[i]-turn;
                }
                turn++;
                k--;
            }
            return ans;
        }
    }
}
