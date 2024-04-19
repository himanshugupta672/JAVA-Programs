class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
          return calculate(nums,n,k) - calculate(nums,n,k-1);
    }
      public static int calculate(int[] arr,int n,int k){
        int l=0;
        int r =0;
        int count =0;
        HashMap<Integer,Integer> hm =new HashMap<>();
        while(r<n){
            if(hm.containsKey(arr[r])){
                hm.put(arr[r], hm.get(arr[r])+1);
            }else{
                hm.put(arr[r], 1);
            }
             while(hm.size()>k){
                hm.put(arr[l], hm.get(arr[l])-1);
                if(hm.get(arr[l])==0){
                    hm.remove(arr[l]);
                }
                l++;
            }
            if(hm.size()<=k){
                count+= (r-l+1);
            }
            r++;
        }
        return count;
}
}