class Solution {
    public int getLucky(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            sb.append(ch-'a'+1);
        }
        while(k-->0){
            int num =0;
            for(char ch:sb.toString().toCharArray()){
                num+= ch-'0';
            }
            sb = new StringBuilder(String.valueOf(num));
        }
        return Integer.parseInt(sb.toString());
    }
}