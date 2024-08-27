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
    public ListNode sortList(ListNode head) {
        /*if(head==null||head.next==null) return head;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        temp = head;
        for(int n:arr){
            temp.val = n;
            temp = temp.next;
        }
        return head;*/
        if(head==null || head.next==null) return head;
        ListNode mid = middle(head);
        ListNode leftHead = head;
        ListNode rightHead = mid.next;
        mid.next= null;
        leftHead=sortList(leftHead);
        rightHead=sortList(rightHead);
        return merge(leftHead,rightHead);
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(left!=null&&right!=null){
            if(left.val<=right.val){
                temp.next = left;
                left=left.next;
            }else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if(left!=null) temp.next= left;
        else temp.next = right;
        return dummyNode.next;
    }
    public ListNode middle(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode slow =head;
        ListNode fast =head.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}