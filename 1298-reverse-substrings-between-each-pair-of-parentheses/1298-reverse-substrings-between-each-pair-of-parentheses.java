class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=')'){
                st.push(ch);
            }
            else if(ch==')'){
                StringBuilder sb = new StringBuilder();
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
                for(int j=0;j<sb.length();j++){
                    st.add(sb.charAt(j));
                }
            } 
        }
        while(!st.isEmpty()){
            char ch = st.pop();
            ans.append(ch);
        }
        return ans.reverse().toString();

    }
}