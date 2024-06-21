class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l =0;
        int r =n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target) return true;

            /*this means there is duplicate element and is not equal to
            target so we will shrink the array from both sides*/
            if(nums[l]==nums[mid]&&nums[mid]==nums[r]){
                l++;
                r--;
                continue;
            }

            //left half is sorted
            if(nums[l]<=nums[mid]){
                //target lies on left half
                if(nums[l]<=target&& nums[mid]>=target){
                    r = mid-1;
                }
                //target lies on right half
                else{
                    l=mid+1;
                }
            }
            //right half is sorted
            else{
                //target lies in right half
                if(nums[mid]<=target&&nums[r]>=target){
                    l = mid+1;
                }
                //target lies on left half
                else{
                    r = mid-1;
                }
            }
        }
        return false;
    }
}