/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null&&root.right==null) return 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int c=1;
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left!=null){
                q.offer(curr.left);
                c++;
            }
            if(curr.right!=null){
                q.offer(curr.right);
                c++;
            }
        }
        return c;
    }
}