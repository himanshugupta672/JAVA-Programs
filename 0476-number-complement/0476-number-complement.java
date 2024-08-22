import java.util.*;
class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        int n = Integer.parseInt(sb.toString(),2);
        return n;
    }
}