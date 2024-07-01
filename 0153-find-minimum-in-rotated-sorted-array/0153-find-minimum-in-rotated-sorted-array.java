class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l=0;
        int r= n-1;
        int min = Integer.MAX_VALUE;
        while(l<=r){
            int mid = (l+r)/2;
            //left half is sorted
            if(nums[l]<=nums[mid]){
                /*min will be min of prev min and left most value of 
                sorted array*/
                min = Math.min(min,nums[l]);
                l=mid+1;
            }
            //right part is sorted
            else{
                min = Math.min(min,nums[mid]);
                r= mid-1;
            }
        }
        return min;
    }
}