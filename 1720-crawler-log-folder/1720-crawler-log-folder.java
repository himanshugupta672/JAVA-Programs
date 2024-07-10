class Solution {
    public int minOperations(String[] logs) {
        /*Stack<String> ans = new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(!logs[i].equals("./")&&!logs[i].equals("../")){
                ans.push(logs[i]);
            }
           else if(logs[i].equals("../")&&!ans.isEmpty()){
                ans.pop();
            } 
        }
        if(ans.isEmpty()) return 0;
        return ans.size();*/
        int c=0;
         for(int i=0;i<logs.length;i++){
            if(!logs[i].equals("./")&&!logs[i].equals("../")){
                c++;
            }
           else if(logs[i].equals("../")&&c!=0){
                c--;
            } 
        }
        return c;
    }
}