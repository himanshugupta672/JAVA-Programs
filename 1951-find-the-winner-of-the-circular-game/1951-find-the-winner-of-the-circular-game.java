class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int i=-1;
        int c=0;
        while(arr.size()>1){
            if(i<arr.size()-1){
                i++;
            }else{
                i=0;
            }
            c++;
            if(c==k){
                arr.remove(i);
                c=0;
                i--;
            }
        }
        return arr.get(0);
    }
}