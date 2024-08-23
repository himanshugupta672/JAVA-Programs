class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0) return 0;
        int i=0;
        int sign=1;
        if(s.charAt(0)=='-'||s.charAt(0)=='+'){
            sign = s.charAt(0)=='-'?-1:1;
            i++;
        }
        long sum=0;
        while(i<s.length()&& Character.isDigit(s.charAt(i))){
            sum = (sum*10)+(s.charAt(i)-'0');

            if(sign*sum<Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else if(sign*sum>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int) (sign*sum);

    }
}