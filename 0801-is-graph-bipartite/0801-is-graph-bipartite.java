class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        for(int i=0;i<n;i++){
            color[i] = -1;
        }
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(!dfs(i,0,graph,color)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int i,int col,int[][]graph,int[] color){
        color[i] = col;
        for(int it: graph[i]){
                if(color[it]==-1){
                    if(!dfs(it,1-col,graph,color)){
                         return false;
                    }
                }else if(color[it]==col){
                    return false;
                }
        }
        return true;
    }
}