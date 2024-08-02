class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String ans = "";
        for(int i=str.length-1;i>=0;i--){
            ans+= str[i];
            if(i!=0){
                ans= ans+" ";
            }
        }
        return ans;
    }
}