class Solution {
    public int longestConsecutive(int[] nums) {
        /*int n = nums.length;
        if(n==0) return 0;
        int max = Integer.MIN_VALUE;
        int x =-1;
        for(int i=0;i<n;i++){
             x = nums[i];
            int c=1;
            while(ls(nums,x+1)==true){
                x=x+1;
                c++;
            }
            max = Math.max(c,max);
        }
        return max;
    }
    public boolean ls(int a[],int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x) return true;
        }
        return false;*/
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0) return 0;
        int prev  =Integer.MIN_VALUE;
        int c=0;
        int max = -1;
        for(int i=0;i<n;i++){
            if(prev==nums[i]-1){
                c++;
                prev = nums[i];
            }else if(prev==nums[i]){
                continue;
            }else{
                c=1;
                prev= nums[i];
            }
            max = Math.max(c,max);
        }
        return max;
    }
}