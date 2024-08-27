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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummyNode = new ListNode(-1);
        ListNode curr = dummyNode;
        int c=0;
        while(t1!=null||t2!=null){
            int sum=c;
            if(t1!=null) sum+=t1.val;
            if(t2!=null) sum+=t2.val;
            c=sum/10;
            sum=sum%10;
            ListNode newNode = new ListNode(sum);
            curr.next= newNode;
            curr = newNode;
            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2=t2.next;
        }
        /*if(t1!=null){
            while(t1!=null){
                int sum = c+t1.val;
                c=sum/10;
                sum=sum%10;
                ListNode newNode = new ListNode(sum);
                curr.next = newNode;
                curr = newNode;
                t1 = t1.next;
            }
        }
        if(t2!=null){
            while(t2!=null){
                int sum = c+t2.val;
                c=sum/10;
                sum=sum%10;
                ListNode newNode = new ListNode(sum);
                curr.next = newNode;
                curr = newNode;
                t2 = t2.next;
            }
        }*/
        if(c==1){
            ListNode newNode = new ListNode(1);
            curr.next= newNode;
        }
        return dummyNode.next;
    }
}