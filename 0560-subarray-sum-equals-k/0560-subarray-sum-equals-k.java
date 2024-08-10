class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int preSum=0;
        int c=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            preSum+= nums[i];
            int rem = preSum-k;

            c+= hm.getOrDefault(rem,0);

            hm.put(preSum,hm.getOrDefault(preSum,0)+1);
        }

        return c;
    }
}