/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 import java.util.*;
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int 
    k) {
        Map<TreeNode,TreeNode> checkParent = new HashMap<>();
        findParent(root,checkParent,target);
        Map<TreeNode,Boolean> visit = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target);
        visit.put(target,true);
        int dis =0;
        while(!q.isEmpty()){
            int size = q.size();
            if(dis==k) break;
            dis++;
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(curr.left!=null && visit.get(curr.left)==null){
                    q.offer(curr.left);
                    visit.put(curr.left,true);
                }
                if(curr.right!=null && visit.get(curr.right)==null){
                    q.offer(curr.right);
                    visit.put(curr.right,true);
                }
                if(checkParent.get(curr)!=null&& visit.get(checkParent.
                get(curr))==null){
                    q.offer(checkParent.get(curr));
                    visit.put(checkParent.get(curr),true);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            ans.add(current.val);
        }
        return ans;
    }

    public static void findParent(TreeNode root,Map<TreeNode,TreeNode> 
    checkParent,TreeNode target){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left!=null){
                checkParent.put(curr.left,curr);
                q.add(curr.left);
            }
            if(curr.right!=null){
                checkParent.put(curr.right,curr);
                q.add(curr.right);
            }
        }
    }
}