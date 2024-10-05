class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        for(int i=0;i<=m-n;i++){
            String str = s2.substring(i,i+2);
            str = str+str;
            if(str.contains(s1)) return true;
        }
        return false;
        
    }
}