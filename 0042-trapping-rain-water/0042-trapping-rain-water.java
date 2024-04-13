class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int preArr[] = preMax(height);
        int sufArr[] = suffMax(height);
        int sum=0;
        for(int i=0;i<n;i++){
            int cal = Math.min(preArr[i],sufArr[i])- height[i];
            sum+=cal;
        }
        return sum;
    }

    public static int[] preMax(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
            ans[i] = max;
        }
        return ans;
    }
    public static int[] suffMax(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            max = Math.max(max,arr[i]);
            ans[i] = max;
        }
        return ans;
    }
}