class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = heights[i];
        }
        int c=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i] != heights[i]){
                c++;
            }
        }
        return c;
    }
}