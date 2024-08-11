class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        String str ="";
        for(int i=0;i<nums.length;i++){
            str+= nums[i];
        }

        int max = Integer.MIN_VALUE;
        String[] arr = str.split("0");
        for(String it:arr){
            max = Math.max(it.length(),max);
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
    }
}