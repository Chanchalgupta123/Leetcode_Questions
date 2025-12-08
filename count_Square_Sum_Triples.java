package LeetCode_Questions;

public class count_Square_Sum_Triples {
    class Solution {
        public int countTriples(int n) {
            int count=0;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    int k= i*i + j*j;
                    int kSquare=(int)Math.sqrt(k);
                    if(kSquare*kSquare==k && kSquare<=n){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
