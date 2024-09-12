class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        for(char ch:allowed.toCharArray()){
            hs.add(ch);
        }
        int c= words.length;
        for(String str:words){
            for(int i=0;i<str.length();i++){
                if(!hs.contains(str.charAt(i))){
                    c--;
                    break;
                }
            }
        }
        return c;
    }
}