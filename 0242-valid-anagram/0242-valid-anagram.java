class Solution {
    public boolean isAnagram(String s, String t) {
        // test case 47/48
        /*int n = s.length();
        int m = t.length();
        if(n!=m) return false;
        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> h2 = new HashMap<>();
        for(char ch: s.toCharArray()){
            h1.put(ch,h1.getOrDefault(ch,0)+1);
        }
        for(char ch: t.toCharArray()){
            h2.put(ch,h2.getOrDefault(ch,0)+1);
        }

        for(char ch: h1.keySet()){
            if(h2.containsKey(ch)){
                if(h1.get(ch)!=h2.get(ch)){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;*/
        char[] c1= s.toCharArray();
        char[] c2= t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}