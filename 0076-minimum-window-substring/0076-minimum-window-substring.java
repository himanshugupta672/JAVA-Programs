class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
      
        // int sIdx=-1;
        // int minLen = Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //     int c=0;
        //       HashMap<Character,Integer> hm = new HashMap<>();
        //     for(int j=0;j<m;j++){
        //         hm.put(t.charAt(j),hm.getOrDefault(t.charAt(j),0)+1);
        //     }
        //     for(int j=0;j<n;j++){
        //         if(hm.containsKey(s.charAt(j))){
        //             if(hm.get(s.charAt(j))>0) c++;
        //             hm.put(s.charAt(j),hm.get(s.charAt(j))-1);
        //         }else{
        //             hm.put(s.charAt(j),-1);
        //         }
        //         if(c==m){
        //             if(j-i+1<minLen){
        //                 minLen = j-i+1;
        //                 sIdx=i;
        //                 break;
        //             }
        //         }
        //     }
        // }
        // return s.substring(sIdx,minLen);
        int l=0;
        int r=0;
        int minLen=Integer.MAX_VALUE;
        int c=0;
        int sIdx=-1;
       int hm[] = new int[256];
        for(int i=0;i<m;i++){
            hm[t.charAt(i)]++;
        }
        while(r<n){
            if(hm[s.charAt(r)]>0) c++;
            hm[s.charAt(r)]--;
            while(c==m){
                if(r-l+1<minLen){
                    minLen = r-l+1;
                    sIdx = l;
                }
                hm[s.charAt(l)]++;
                if(hm[s.charAt(l)]>0) c--;
                l++;
            }
            r++;
        }
        return sIdx==-1? "": s.substring(sIdx,sIdx+minLen);
    }
}