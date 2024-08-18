class Solution {
    public int nthUglyNumber(int n) {
        if(n<=6){
            return n;
        }
        int ans =-1;
        int i = 1;
        int c=0;
        while(c!=n){
            if(isUgly(i)){
                c++;
                if(c==n){
                    ans=i;
                }
            }
            i++;
        }
        return ans;
    }
    public boolean isUgly(int n){
        if(n==0) return false;
        if(n>0&&n<=3) return true;
        if(n%2==0) return isUgly(n/2);
        if(n%3==0) return isUgly(n/3);
        if(n%5==0) return isUgly(n/5);
        return false;
    }
}