class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> h1 = new HashSet<List<Integer>>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int rem = -(nums[i]+nums[j]);
                if(hs.contains(rem)){
                    List<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(rem);
                    ls.add(nums[j]);
                    Collections.sort(ls);
                    h1.add(ls);
                }
                hs.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(h1);
        return ans;

    }
}