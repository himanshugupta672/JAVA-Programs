class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new 
        ArrayList<ArrayList<Integer>>();
        int n = graph.length;
        // reversing the graph
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int it: graph[i]){
                adj.get(it).add(i);
            }
        }
        // calculating inDegree
        int inDegree[] = new int[n];
        for(int i=0;i<n;i++){
            for(int it: adj.get(i)){
                inDegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.peek();
            ans.add(node);
            q.remove();
            for(int it:adj.get(node)){
                inDegree[it]--;
                if(inDegree[it]==0){
                    q.add(it);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}