class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int preSum=1;
        int sufSum=1;
        for(int i=0;i<n;i++){
            if(preSum==0) preSum=1;
            if(sufSum==0) sufSum=1;
            preSum*= nums[i];
            sufSum*= nums[n-i-1];
            max = Math.max(max,Math.max(preSum,sufSum));
        }
        return max;
    }
}