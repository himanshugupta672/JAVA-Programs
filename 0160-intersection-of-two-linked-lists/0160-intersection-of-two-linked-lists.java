/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        Stack<ListNode> st = new Stack<>();
        while(temp1!=null&&temp2!=null){
            if(temp1==temp2) return temp1;
            if(st.contains(temp1)){
                st.add(temp1);
                return st.pop();
            }else if(st.contains(temp2)){
                st.add(temp2);
                return st.pop();
            }else{
                st.add(temp1);
                st.add(temp2);
            }
            temp1= temp1.next;
            temp2=temp2.next;
        }
        if(temp1!=null){
            while(temp1!=null){
                if(st.contains(temp1)){
                    st.add(temp1);
                    return st.pop();
                }else{
                    st.add(temp1);
                }
                temp1 = temp1.next;
            }
        }
        if(temp2!=null){
            while(temp2!=null){
                if(st.contains(temp2)){
                    st.add(temp2);
                    return st.pop();
                }else{
                    st.add(temp2);
                }
                temp2 = temp2.next;
            }
        }
        return null;
    }
}