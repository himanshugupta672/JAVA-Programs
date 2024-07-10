class Solution {
    public int minOperations(String[] logs) {
        Stack<String> ans = new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("./")){
                continue;
            }else if(logs[i].equals("../")&&!ans.isEmpty()){
                ans.pop();
            }else if(!logs[i].equals("./")&&!logs[i].equals("../")){
                ans.push(logs[i]);
            }
        }
        if(ans.isEmpty()) return 0;
        return ans.size();
    }
}