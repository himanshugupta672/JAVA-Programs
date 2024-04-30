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
    public int maxPathSum(TreeNode root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        calculate(root,max);
        return max[0];
    }

    public static int calculate(TreeNode root,int[] max ){
        if(root==null){
            return 0;
        }
        int lSum = Math.max(0,calculate(root.left,max));
        int rSum = Math.max(0,calculate(root.right,max));
        max[0] = Math.max(max[0],lSum+rSum+root.val);
        return Math.max(lSum,rSum)+ root.val;
    }
}