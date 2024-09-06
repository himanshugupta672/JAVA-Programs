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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = Integer.MIN_VALUE;
        for(int n:nums){
            max = Math.max(max,n);
        }
        boolean arr[] = new boolean[max+1];
        for(int n:nums){
            arr[n] = true;
        }
        ListNode newHead = new ListNode();
        ListNode temp= newHead;
        while(head!=null){
            if((head.val>=arr.length)||(arr[head.val]==false)){
                temp.next = head;
                temp = temp.next;
            }
            head= head.next;
        }
        temp.next=null;
        return newHead.next;
















        /*ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr1.add(nums[i]);
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            if(!arr1.contains(temp.val)){
                arr2.add(temp.val);
            }
            temp = temp.next;
        }
        ListNode newHead = new ListNode(arr2.get(0));
        ListNode temp1 = newHead;
        for(int i=1;i<arr2.size();i++){
            ListNode newNode = new ListNode(arr2.get(i));
            temp1.next = newNode;
            temp1 = newNode;
        }
        return newHead;*/













        /*ListNode back = head;
        while(arr.contains(head.val)){
            head= head.next;
        }
        ListNode temp = head;
        while(temp!=null){
            if(arr.contains(temp.val)){
                if(temp.next==null){
                    back.next=null;
                }else{
                    back.next = temp.next;
                    temp = back.next;
                }
            }else{
                back = temp;
                temp = temp.next;
            }
        }
        return head;*/
    }
}