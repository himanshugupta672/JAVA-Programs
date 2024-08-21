class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(i<s.length()-1&&hm.get(ch)<hm.get(s.charAt(i+1))){
                sum+= hm.get(s.charAt(i+1))-hm.get(ch);
                i++;
            }else{
                sum+= hm.get(ch);
            }
        }
        return sum;
    }
}