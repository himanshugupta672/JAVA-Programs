class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = numBottles;
        int d = numBottles/numExchange;
        int r = numBottles%numExchange;
        int s = (d+r);
        sum+=d;
        while(s>=numExchange){
            d=s/numExchange;
            r=s%numExchange;
            sum+=d;
            s=d+r;
        }
        return sum;
    }
}