class Solution {
    public double averageWaitingTime(int[][] customers) {
        ArrayList<Integer> ans = new ArrayList<>();
        int at =0;
        int st =0;
        int pt =0;
        int wt =0;
        for(int i=0;i<customers.length;i++){
            at= customers[i][0];
            if(i==0){
                st = at;
            }
            if(at>st){
                st = at;
            }
            pt= st+customers[i][1];
            wt=pt-at;
            ans.add(wt);
            st=pt;
        }
        double sum=0;
        for(int i=0;i<ans.size();i++){
            sum+= ans.get(i);
        }
        return sum/ans.size();
    }
}