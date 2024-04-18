class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lSum =0;
        int maxSum=0;
        int rSum = 0;
        for(int i=0;i<k;i++){
            lSum+= cardPoints[i];
        }
         maxSum = lSum;
         int rIdx = n-1;
         for(int i=k-1;i>=0;i--){
            lSum = lSum - cardPoints[i];
            rSum+= cardPoints[rIdx];
            rIdx--;
            maxSum = Math.max(maxSum,(lSum+rSum));
         }
         return maxSum;
    }
}