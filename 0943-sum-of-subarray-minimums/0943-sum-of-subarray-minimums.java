class Solution {
    public int sumSubarrayMins(int[] arr) {
       int nSmaller[] = nextSmaller(arr);
        int pSmaller[] = prevSmaller(arr);
        int mod = 1000000007;
        long c=0;
        for(int i=0;i<arr.length;i++){
            int first = i - pSmaller[i];
            int second = nSmaller[i] -i;
            long pro = (long)(first*second)%mod;
           c = (c+ pro*arr[i])%mod;
        }
        return (int)c; 
    }
     public static int[] nextSmaller(int []arr){
        int n= arr.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                ans[i] = n;
            }else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    public static int[] prevSmaller(int []arr){
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){

            while(!stack.isEmpty()&& arr[stack.peek()]>arr[i]){
                stack.pop();
            }


              if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}