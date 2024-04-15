import java.util.*;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
        }
        if(count==nums.length){
            if(count==k){
                return k;
            }
            return 0;
        }
        int len = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    c++;
                }
                if(c<=k){
                    len = Math.max(len,j-i+1);
                }else{
                    break;
                }
            }
        }
        return len;
    }
}