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
    public ListNode mergeNodes(ListNode head) {
        head=head.next;
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        int sum=0;
        while(temp!=null){
            sum = sum+temp.val;
            if(temp.val==0){
                st.push(sum);
                sum=0;
            }
            temp = temp.next;
        }
        ListNode newHead = new ListNode(st.pop());
        ListNode newTemp = newHead;
        while(!st.isEmpty()){
            ListNode newNode = new ListNode(st.pop());
            newNode.next = newHead;
            newHead = newNode;
        } 
        return newHead;
    }
}