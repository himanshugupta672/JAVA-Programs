/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] res = {-1,-1};
        if(head.next.next==null) return res;
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head.next;
        int prev=head.val;
        int c=2;
        while(temp.next!=null){
            if((temp.val>prev&&temp.val>temp.next.val)||(temp.val<prev&&
            temp.val<temp.next.val)){
                ans.add(c);
            }
            c++;
            prev=temp.val;
            temp = temp.next;
        }
        if(ans.size()<2) return res;

        Collections.sort(ans);
        res[1] = ans.get(ans.size()-1)-ans.get(0);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<ans.size();i++){
            int diff = ans.get(i)-ans.get(i-1);
            min = Math.min(min,diff);
        }
        res[0] = min;
        return res;

    }
}