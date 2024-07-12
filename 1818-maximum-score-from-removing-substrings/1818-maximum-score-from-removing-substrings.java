class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans =0;
        String high, low;
        int highs=0, lows=0;
        if(y>x){
            high="ba";
            highs=y;
            low="ab";
            lows=x;
        }else{
            high="ab";
            highs=x;
            low="ba";
            lows=y;
        }
        StringBuilder s1 = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(ch==high.charAt(1)&& s1.length()>0&&s1.charAt(s1.length
            ()-1)==high.charAt(0)){
                ans+=highs;
                s1.setLength(s1.length()-1);
            }else{
                s1.append(ch);
            }
        }
        StringBuilder s2 = new StringBuilder();
        for(char ch: s1.toString().toCharArray()){
            if(ch==low.charAt(1)&&s2.length()>0&&s2.charAt(s2.length()
            -1)==low.charAt(0)){
                ans+=lows;
                s2.setLength(s2.length()-1);
            }else{
                s2.append(ch);
            }
        }
        return ans;
    }
}