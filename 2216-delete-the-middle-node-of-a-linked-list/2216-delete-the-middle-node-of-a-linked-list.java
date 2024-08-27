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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode slow =head;
        ListNode fast = head;
        int c=0;
        while(fast!=null&&fast.next!=null){
            if(c!=0){
            slow = slow.next;
            }
            fast = fast.next.next;
            c++;
        }
        if(slow.next!=null){
            slow.next = slow.next.next;
        }else{
            slow.next = null;
        }
        return head;
    }
}