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
    public List<List<Integer>> lo(TreeNode root){
        List<List<Integer>> al=new ArrayList<>();
        if(root==null){
            return al;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        ArrayList<Integer> l=new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
              al.add(l);
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                    l=new ArrayList<>();
                }
            }
            
            else{
                l.add(curr.val);
                // System.out.println(l);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            
        }
        return al;

    } 
    public List<List<Integer>> levelOrder(TreeNode root) {
        return lo(root);
    }
}
