class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm = new HashMap<>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        for(String s:str1){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(String s:str2){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        List<String> ans = new ArrayList<>();
        for(String key:hm.keySet()){
            if(hm.get(key)==1){
                ans.add(key);
            }
        }
        return ans.toArray(new String[0]);
    }
}