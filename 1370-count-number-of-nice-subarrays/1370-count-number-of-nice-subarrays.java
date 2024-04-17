class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return calculate(nums,k) - calculate(nums,k-1);
    }

    public static int calculate(int []arr,int k){
        
        int sum =0;
        int l=0;
        int r=0;
        int c=0;
        while(r<arr.length){
            if(arr[r]%2==1){
            sum++;
            }
            while(sum>k){
                if(arr[l]%2==1){
                sum--;
                }
                l++;
            }
            c+= (r-l+1);
            r++;
        }
        return c;
    }
}