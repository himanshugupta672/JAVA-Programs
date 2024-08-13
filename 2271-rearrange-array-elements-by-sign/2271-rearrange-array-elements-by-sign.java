class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int p=0;
        int n=1;
        int ans[] = new int[l];
        for(int i=0;i<l;i++){
            if(nums[i]>0){
                ans[p]=nums[i];
                p+=2;
            }else{
                ans[n]=nums[i];
                n+=2;
            }
        }
        return ans;
    }
}