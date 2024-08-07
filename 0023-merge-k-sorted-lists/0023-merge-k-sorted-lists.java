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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = lists.length;
        for(int i=0;i<n;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                pq.add(temp.val);
                temp = temp.next;
            }
        }

        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;

        while(!pq.isEmpty()){
            ListNode newNode = new ListNode(pq.remove());
            temp.next = newNode;
            temp = temp.next;
        }
        return newHead.next;
    }
}