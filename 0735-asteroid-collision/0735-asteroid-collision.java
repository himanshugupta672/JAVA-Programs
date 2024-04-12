class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
         Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++){

             while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0){
                int sum = stack.peek() + asteroids[i];
                 if(sum<0){
                    stack.pop();
                }
                 else if(sum>0){
                    asteroids[i]=0;
                    }else{
                    stack.pop();
                    asteroids[i] =0;
                    
                }
            }
            if(asteroids[i]!=0){
                stack.push(asteroids[i]);
            }
            
        }
        int n = stack.size();
        int arr[] = new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i] = stack.pop();
        }
        return arr;
    }
}