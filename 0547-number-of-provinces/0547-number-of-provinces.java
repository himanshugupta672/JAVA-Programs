class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean vis[] = new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                dfs(isConnected,vis,i);
                c++;
            }
        }
        return c;
    }
    public static void dfs(int[][] isConnected,boolean vis[],int i){
        vis[i] = true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && !vis[j]){
                dfs(isConnected,vis,j);
            }
        }
    }
}