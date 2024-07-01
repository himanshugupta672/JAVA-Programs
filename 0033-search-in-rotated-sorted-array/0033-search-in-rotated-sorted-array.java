class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l =0;
        int r =n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            } 
            //left part is sorted 
            if(nums[l]<=nums[mid]){
                //target is in left part 
                if(nums[l]<=target&&nums[mid]>=target){
                    r=mid-1;
                }
                //target is in right part
                else{
                    l=mid+1;
                }
            }
            //right part is sorted
            else{
                //target is in right part 
                if(nums[mid]<=target&&nums[r]>=target){
                    l = mid+1;
                }
                //target is in left part
                else{
                    r = mid-1;
                }
            }
        }
        return -1;
    }
}