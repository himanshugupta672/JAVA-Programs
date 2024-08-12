class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l=0;;
        int r=0;
        long ans=0;
        long sum=0;

        /*while(r<n){
            if(nums[r]*(r-l+1)<=k+sum){
                ans = Math.max(ans,r-l+1);
                r++;
                if(r<n) sum+=nums[r];
            }else{
                sum-=nums[l];
                l++;
            } 
        }*/
        while(r<n){
            sum+=nums[r];
            while(nums[r]*(r-l+1L)>k+sum){
                sum-=nums[l];
                l++;
            }
            ans = Math.max(ans,r-l+1L);
            r++; 
        }
        return (int )ans;
    }
}