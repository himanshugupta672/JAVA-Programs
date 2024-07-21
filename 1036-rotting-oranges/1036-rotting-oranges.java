class Pair{
    int r;
    int c;
    int t;
    Pair(int r,int c,int t){
        this.r =r;
        this.c =c;
        this.t =t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int vis[][] = new int[n][m];
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time =0;
        int count=0;
        int dRow[] ={-1,0,1,0};
        int dCol[] ={0,1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek().r;
            int col = q.peek().c;
            int tm = q.peek().t;
            time = Math.max(time,tm);
            q.remove();
            for(int i=0;i<4;i++){
                int nr = row+dRow[i];
                int nc = col+dCol[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&grid[nr][nc]==1&&vis[nr][nc]
                !=2){
                    q.add(new Pair(nr,nc,tm+1));
                    vis[nr][nc] =2;
                    count++;
                }
            }
        }
        if(count!=fresh) return -1;
        return time;
    }
}