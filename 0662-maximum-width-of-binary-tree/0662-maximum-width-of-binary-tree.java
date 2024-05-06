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
 import java.util.*;
  class Pair{
        TreeNode node;
        int idx;
        Pair(TreeNode nd,int id){
            idx = id;
            node = nd;
        }
    }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans=0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().idx;
            int first =0;
            int last =0;
            for(int i=0;i<size;i++){
                int currIdx = q.peek().idx;
                TreeNode node = q.peek().node;
                q.poll();
                if(i==0) first = currIdx;
                if(i==size-1) last = currIdx;
                if(node.left!=null){
                    q.offer(new Pair(node.left,currIdx*2+1));
                }
                if(node.right!=null){
                    q.offer(new Pair(node.right,currIdx*2+2));
                }
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}