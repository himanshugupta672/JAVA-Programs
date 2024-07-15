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
    public TreeNode createBinaryTree(int[][] descriptions) {
        int n = descriptions.length;
        HashMap<Integer,TreeNode> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(descriptions[i][0])){
                hm.put(descriptions[i][0],new TreeNode(descriptions[i]
                [0]));
            }
            if(!hm.containsKey(descriptions[i][1])){
                hm.put(descriptions[i][1],new TreeNode(descriptions[i]
                [1]));
            }
            if(descriptions[i][2]==1){
                hm.get(descriptions[i][0]).left = hm.get(descriptions[i]
                [1]);
            }else{
                hm.get(descriptions[i][0]).right = hm.get(descriptions[i]
                [1]);
            }
            hs.add(descriptions[i][1]);
        }
        for(TreeNode i: hm.values()){
            if(!hs.contains(i.val)){
                return i;
            }
        }
        return null;
    }
}