import java.util.*;

class Solution {
    public int longestOnes(int[] nums, int k) {
        /* BRUTE FORCE 
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        if (count == nums.length) {
            if (count == k) {
                return k;
            }
            return 0;
        }
        int len = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == 0) {
                    c++;
                }
                if (c <= k) {
                    len = Math.max(len, j - i + 1);
                } else {
                    break;
                }
            }
        }
        return len;*/

        //BETTER ON CODEING NINJA

        //OPTIMAL SOLUTION
        int l=0;
        int r=0;
        int zero=0;
        int max= Integer.MIN_VALUE;
        while(r<nums.length){
            if(nums[r]==0){
                zero++;
            }
            if(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            if(zero<=k){
                max = Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}
