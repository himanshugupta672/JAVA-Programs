
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int n = boxTypes.length;
        Arrays.sort(boxTypes,(a,b)->a[1]-b[1]);
        int ans =0;
        for(int i=n-1;i>=0;i--){
            if(boxTypes[i][0]<=truckSize){
                ans+= boxTypes[i][1]*boxTypes[i][0];
                truckSize-= boxTypes[i][0];
            }else{
                ans+=  truckSize*boxTypes[i][1];
                break;
            }
        }
        return ans;
    }
}