class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         return calculate(nums,goal) - calculate(nums,goal-1);
    }
     public static int calculate(int []arr,int k){
        if(k<0){
            return 0;
        }
        int sum =0;
        int l=0;
        int r=0;
        int c=0;
        while(r<arr.length){
            sum += arr[r];
            while(sum>k){
                sum = sum-arr[l];
                l++;
            }
            /*here we are taking number of subarray upto that particular length which must be
             equal to the length of subarray at that point*/
            c+= (r-l+1);
            r++;
        }
        return c;
    }
}