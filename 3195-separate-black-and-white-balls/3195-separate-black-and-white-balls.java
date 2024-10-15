class Solution {
    public long minimumSteps(String s) {
        
        int n = s.length();
        long ans=0;
        // int flag=0;
        // while(flag==0){
        //     flag=1;
        //     for(int i=n-1;i>0;i--){
        //         if(sb.charAt(i)=='0'&&sb.charAt(i-1)=='1'){
        //             char temp = sb.charAt(i);
        //             sb.setCharAt(i,sb.charAt(i-1));
        //             sb.setCharAt(i-1,temp);
        //             ans++;
        //             flag=0;
        //         }
        //     }
        // }
        // return ans;
        // int l=0;
        // int r=n-1;
        // while(l<r){
        //     if(sb.charAt(l)=='1'&&sb.charAt(r)=='0'){
        //         char temp = sb.charAt((int)r);
        //         sb.setCharAt(r,sb.charAt(l));
        //         sb.setCharAt(l,temp);
        //         ans+= r-l;
        //         l++;
        //     }
        //     r--;
        // }
        // return ans;
        long c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1') c++;
            else ans+=c;
        }
        return ans;
    }
}