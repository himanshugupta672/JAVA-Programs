class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int arr[] = new int[256];
        int l=0;
        int r=0;
        int maxLen=0;
        for(int i=0;i<256;i++){
            arr[i]=-1;
        }
        while(l<n&&r<n){
            if(arr[s.charAt(r)]!=-1){
                if(arr[s.charAt(r)]>=l){
                    l = arr[s.charAt(r)]+1;
                }
            }
            int len = r-l+1;
            maxLen= Math.max(maxLen,len);
            arr[s.charAt(r)] = r;
            r++;
        }
        return maxLen;
    }
}