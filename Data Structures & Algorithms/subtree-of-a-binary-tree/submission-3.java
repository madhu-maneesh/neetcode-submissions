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
    public boolean Identical(TreeNode root, TreeNode subroot){
        if(root==null && subroot==null)return true;
        if(root==null || subroot==null|| root.val!=subroot.val)return false;
    
        return (root.val==subroot.val) && 
        Identical(root.left,subroot.left) &&  Identical(root.right,subroot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(root==null){
            return false;
        }
        if(Identical(root,subroot)){
            return true;
        }
        return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);

    }
}
