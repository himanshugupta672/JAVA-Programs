import java.util.*;
class Solution {
    public String countAndSay(int n) {
        /*if(n==1) return "1";
        if(n==2) return "2";
        String s = "11";
        for(int i=0;i<s.length();i++){
            String temp = "";
            s+= "$";
            int c=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-1)){
                    c++;
                }else{
                    temp+= Integer.toString(c);
                    temp+= s.charAt(j-1);
                    c=1;                
                    }
            }
            s=temp;
        }
        return s;*/

        //Using Recursion
        if(n==1) return "1";

        String s = countAndSay(n-1);
        String res = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int c=1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1) ){
                c++;
                i++;
            }
            res+= Integer.toString(c) + Character.toString(ch);
        }
        return res;
    }
}