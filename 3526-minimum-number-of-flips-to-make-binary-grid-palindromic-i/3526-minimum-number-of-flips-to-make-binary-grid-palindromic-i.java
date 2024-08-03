class Solution {
    public int minFlips(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int a=0;

        for(int i=0;i<n;i++){
            int l =0;
            int r =m-1;
            while(l<r){
                if(grid[i][l]!=grid[i][r]){
                    a++;
                }
                l++;
                r--;
            }
        }

        int b=0;
        for(int j=0;j<m;j++){
            int tp=0;
            int btm=n-1;
            while(tp<btm){
                if(grid[tp][j]!=grid[btm][j]){
                    b++;
                }
                    tp++;
                    btm--;
                
            }
        }
        return Math.min(a,b);
    }
}