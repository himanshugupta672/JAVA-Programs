class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int aCount=0;
        int bCount=0;
        int cCount=0;
        StringBuilder sb = new StringBuilder();
        int totLen = a+b+c;
        while(totLen-->0){
            if((a>=b&&a>=c&&aCount!=2)||(a>0&&(bCount==2||cCount==2))){
                sb.append("a");
                a--;
                aCount++;
                bCount=0;
                cCount=0;
            }
            else if((b>=a&&b>=c&&bCount!=2)||(b>0&&(aCount==2||cCount==2))){
                sb.append("b");
                b--;
                bCount++;
                aCount=0;
                cCount=0;
            }
            else if((c>=b&&c>=a&&cCount!=2)||(c>0&&(bCount==2||aCount==2))){
                sb.append("c");
                c--;
                cCount++;
                bCount=0;
                aCount=0;
            }
        }
        return sb.toString();
    }
}