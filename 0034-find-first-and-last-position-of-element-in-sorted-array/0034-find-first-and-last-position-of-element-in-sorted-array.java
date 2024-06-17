class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = findStarting(nums,target);
        ans[1] = findEnding(nums,target);
        return ans;
    }

    public static int findStarting(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<target){
                l=mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }

    public static int findEnding(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]<target){
                l=mid+1;
            }else if(nums[mid]>target){
                r=mid-1;
            }else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
}