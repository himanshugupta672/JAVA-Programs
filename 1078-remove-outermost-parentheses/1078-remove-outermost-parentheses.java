class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int open=0;
        int close=0;
        int n= s.length();
        String str ="";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            str+=ch;
            if(ch=='(') open++;
            else close++;
            if(open==close){
                String sub = str.substring(1,str.length()-1);
                sb.append(sub);
                str="";
                open=0;
                close=0; 
            }
        }
        return sb.toString();
    }
}