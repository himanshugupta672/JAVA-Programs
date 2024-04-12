class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack();
        for(char ch: num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek()>ch){
                stack.pop();
                k--;
            }
            if(!stack.isEmpty() || ch!=0){
                stack.push(ch);
            }
        }

        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();

        //remove leading zeros
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

       if(sb.length()>0){
        return sb.toString();
       }
       return "0";
        
    }
}