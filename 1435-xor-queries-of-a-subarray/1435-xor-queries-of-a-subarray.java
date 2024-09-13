class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int ans[] = new int[n];
        int j=0;
        for(int temp[]:queries){
            int xor = 0;
            for(int i=temp[0];i<=temp[1];i++){
                xor^=arr[i];
            }
            ans[j]=xor;
            if(j<n) j++;
        }
        return ans;
    }
}