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
 import java.util.*;
 class Pair{
    int first;
    ListNode second;
     Pair(int first,ListNode second){
        this.first = first;
        this.second = second;
    }
 }
 
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        /*PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = lists.length;
        for(int i=0;i<n;i++){
            ListNode temp = lists[i];
            while(temp!=null){
                pq.add(temp.val);
                temp = temp.next;
            }
        }
        if(pq.isEmpty()) return null;
        ListNode newHead = new ListNode(pq.remove());
        ListNode temp = newHead;

        while(!pq.isEmpty()){
            ListNode newNode = new ListNode(pq.remove());
            temp.next = newNode;
            temp = temp.next;
        }
        return newHead;*/
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> 
        a.val-b.val);
        int n= lists.length;
        for(int i=0;i<n;i++){
            if(lists[i]!=null)
            pq.add(lists[i]);
        }
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        while(!pq.isEmpty()){
            ListNode newNode = pq.remove();
            temp.next = newNode;
            if(newNode.next!=null){
                pq.add(newNode.next);
            }
            temp = temp.next;
        }
        return newHead.next;
    }
}