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
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(arr);
        ListNode newHead = new ListNode(arr.get(0));
        ListNode newTemp = newHead;
        for(int n :arr){
            ListNode newNode = new ListNode(n);
            newTemp.next = newNode;
            newTemp = newNode;
        }
        return newHead.next;
    }
}