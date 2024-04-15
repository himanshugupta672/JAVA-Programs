class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        String input = s;
       	HashMap<Character,Integer> hm = new HashMap<>();
		int l=0;
		int r=0;
		int len = Integer.MIN_VALUE;
		int n = input.length();
		while(r<n){
			if(hm.containsKey(input.charAt(r))){
				l = Math.max(hm.get(input.charAt(r))+1, l);
			}
			hm.put(input.charAt(r),r);
			len = Math.max(len, r-l+1);
			r++;
		}
		return len;      
    }
}