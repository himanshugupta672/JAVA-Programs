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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null) return null;
        if(list1==null) return list2;
        else if(list2==null) return list1;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode newHead = null;
        if(curr1.val<=curr2.val){
            newHead = curr1;
            curr1 = curr1.next;
        }else{
            newHead = curr2;
            curr2 = curr2.next;
        }
        ListNode temp = newHead;
        while(curr1!=null&&curr2!=null){
            if(curr1.val<=curr2.val){
                temp.next = curr1;
                curr1 = curr1.next;
            }else{
                temp.next = curr2;
                curr2 = curr2.next;
            }
            temp = temp.next;
        }
        if(curr1!=null){
            temp.next = curr1;
        }
        if(curr2!=null){
            temp.next = curr2;
        }
        return newHead;
    }
}