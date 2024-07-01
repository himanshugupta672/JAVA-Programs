class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i=0;int j=0;
        int n = arr.length;
        while(j<n){
            if(arr[j]%2!=0){
                if(j-i+1==3){
                    return true;
                }
            }else{
                i=j+1;
            }
            j++;
        }
        return false;
    }
}