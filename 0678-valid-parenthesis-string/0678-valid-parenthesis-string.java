class Solution {
    public boolean checkValidString(String s) {
        /*int c=0;
        int star=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(') c++;
            else if(ch==')') c--;
            else star++;
        }
        if(c==0)return true;
        else if(c-star==0) return true;
        else if(c+star==0) return true;
        return false;*/
        int min=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                min++;
                max++;
            }else if(ch==')'){
                min--;
                max--;
            }else{
                min--;
                max++;
            }
            if(max<0) return false;
            min = Math.max(min,0);
        }
        return min==0;
    }
}