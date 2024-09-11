class Solution {
    public int minBitFlips(int start, int goal) {
        String s1 = Integer.toBinaryString(start);
        String s2 = Integer.toBinaryString(goal);
        int n = s1.length();
        int m = s2.length();
        if(n<m){
            for(int i=0;i<m-n;i++){
                s1="0"+s1;
            }
        }else if(m<n){
            for(int i=0;i<n-m;i++){
                s2="0"+s2;
            }
        }
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) c++;
        }
        return c;
    }
}