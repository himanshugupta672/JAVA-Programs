class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch :s.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}