class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int vis[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||j==0||i==n-1||j==m-1){
                    if(board[i][j]=='O'){
                        q.add(new Pair(i,j));
                        vis[i][j] = 1;
                    }
                }
            }
        }

        int dRow[] = {-1,0,1,0};
        int dCol[] = {0,1,0,-1};
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            for(int i=0;i<4;i++){
                int r = row+dRow[i];
                int c = col+dCol[i];
                if(r>=0&&r<n&&c>=0&&c<m&&vis[r][c]==0&&board[r][c]=='O'){
                    q.add(new Pair(r,c));
                    vis[r][c] =1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'&&vis[i][j]==0){
                    board[i][j]= 'X';
                }
            }
        }
    }
}
