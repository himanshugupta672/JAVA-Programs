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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }

        TreeNode root = buildTree(inorder,0,inorder.length-1,postorder,
        0,postorder.length-1,hm);
        return root;
    }

    public static TreeNode buildTree(int[] inorder,int is,int ie,int[] 
    postorder,int ps,int pe, HashMap<Integer,Integer> hm ){
        if(is>ie||ps>pe) return null;

        TreeNode root = new TreeNode(postorder[pe]);

        int inRoot = hm.get(postorder[pe]);
        int nLeft = inRoot-is;

        root.left = buildTree(inorder,is,inRoot-1,postorder,ps,ps
        +nLeft-1,hm);

        root.right = buildTree(inorder,inRoot+1,ie,postorder,ps+nLeft,
        pe-1,hm);

        return root;
        

    }
}