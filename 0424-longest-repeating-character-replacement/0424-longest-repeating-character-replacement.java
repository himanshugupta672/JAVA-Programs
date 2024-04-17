import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm = new HashMap();
        int l=0;
        int r =0;
        int maxFre =0;
        int maxLen = 0;
        while(r<s.length()){
            if(hm.containsKey(s.charAt(r))){
                hm.put(s.charAt(r),hm.get(s.charAt(r))+1);
            }else{
                hm.put(s.charAt(r),1);
            }
            maxFre = Math.max(maxFre,hm.get(s.charAt(r)));
            while((r-l+1)-maxFre>k){
                hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
                for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
                    maxFre = Math.max(maxFre,entry.getValue());
                }
                l++;
            }
            if((r-l+1)-maxFre<=k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}