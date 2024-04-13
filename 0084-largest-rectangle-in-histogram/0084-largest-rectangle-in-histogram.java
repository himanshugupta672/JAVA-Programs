class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int larr[] = leftSmaller(heights);
        int rarr[] = rightSmaller(heights);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int cal = (rarr[i] - larr[i] + 1)* heights[i];
            max = Math.max(max,cal);
        }
        return max;
         
    }
    public static int[] leftSmaller(int[] arr){
        Stack<Integer> stack = new Stack();
        int n = arr.length;
        int ans[] = new int[n]; 
        for(int i=0;i<n;i++){

            while(!stack.isEmpty()  &&  arr[stack.peek()]>=arr[i]){
                stack.pop();
            }

            if(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                ans[i] = stack.peek()+1;
            }else{
                ans[i] = 0;
            }
            stack.push(i);
        }
        return ans;
    }
    public static int[] rightSmaller(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }

            if(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                ans[i] = stack.peek()-1;
            }else{
                ans[i] = n-1;
            }
            stack.push(i);
        }
        return ans;
    }
}