class Solution {
    public int minSteps(int n) {
        int sum=0;
        int i=2;
        while(n!=1){
            if(n%i==0){
                sum+=i;
                n=n/i;
            }else{
                i++;
            }
        }
        return sum;
    }
}