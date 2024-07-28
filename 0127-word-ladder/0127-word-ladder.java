class Pair{
    String first;
    int second;
    Pair(String first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
     Queue<Pair> q = new LinkedList<>();
     q.add(new Pair(beginWord,1));  
     Set<String> s = new HashSet<>();
     int n = wordList.size();
     for(int i=0;i<n;i++){
        s.add(wordList.get(i));
     } 
     s.remove(beginWord);
     while(!q.isEmpty()){
        String str = q.peek().first;
        int step = q.peek().second;
        q.remove();

        if(str.equals(endWord)==true) return step;

        for(int i=0;i<str.length();i++){
            for(char j='a';j<='z';j++){
                char ch[] = str.toCharArray();
                ch[i] = j;
                String newStr = new String(ch);
                if(s.contains(newStr)==true){
                    s.remove(newStr);
                    q.add(new Pair(newStr,step+1));
                } 
            }
        }
     }
     return 0;
    }
}