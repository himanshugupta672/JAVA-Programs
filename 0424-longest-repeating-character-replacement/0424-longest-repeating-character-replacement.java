import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm = new HashMap();
        int l=0;
        int r =0;
        int maxFre =0;
        int maxLen = 0;
        while(r<s.length()){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            maxFre = Math.max(maxFre,hm.get(s.charAt(r)));
            if((r-l+1)-maxFre>k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                l++;
            }else{
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}