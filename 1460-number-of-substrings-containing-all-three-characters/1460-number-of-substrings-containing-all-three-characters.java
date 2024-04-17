class Solution {
    public int numberOfSubstrings(String s) {
         int  c=0;
    int lastSeen[] = {-1,-1,-1};
    for(int i=0;i<s.length();i++){
        lastSeen[s.charAt(i)-'a'] = i;
        if(lastSeen[0]!=-1 &&lastSeen[1]!=-1 &&lastSeen[2]!=-1){
            c+= 1+ findMin(lastSeen[0],lastSeen[1],lastSeen[2]);
        }
    }
    return c;
    }
    public static int findMin(int a,int b,int c){
        if(a<b&&a<c){
            return a;
        }else if(b<a&&b<c){
            return b;
        }
        return c;
    }
}