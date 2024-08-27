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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||(head.next==null&&n==1)) return null; 
        int l = length(head);
        if(l==n) return head.next;
        int len = l-n;
        int c=1;
        ListNode temp = head;
        while(c!=len){
            temp = temp.next;
            c++;
        }
        if(temp.next!=null){
            temp.next = temp.next.next;
        }else{
            temp.next =null;
        }

        return head;
    }
    public int length(ListNode head){
        ListNode temp = head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        return c;
    }
}