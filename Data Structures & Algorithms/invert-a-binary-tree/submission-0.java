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
    // public TreeNode invert(TreeNode root){
    //     if(root==null){
    //         return null;
    //     }
    //     TreeNode lf=root.left;
    //     TreeNode rg=root.right;
    //     root.left=invert(root.right);
    //     root.right=invert(root.right);
    //     return root;
    // }
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
         TreeNode l=invertTree(root.left);
         TreeNode r=invertTree(root.right);
         root.left=r;
         root.right=l;
         return root;
    }
}
