class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]) return 0;
        int l =0;
        int r = nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                ans=mid;
                return mid;
            }else if(nums[mid]<target){
                ans=mid+1;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return ans;
    }
}