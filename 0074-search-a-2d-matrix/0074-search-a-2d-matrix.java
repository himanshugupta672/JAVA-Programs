class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr:matrix){
            int n = arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]==target) return true;
            }
        }
        return false;
    }
}