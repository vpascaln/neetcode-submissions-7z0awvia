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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preOrder( p, q);
    }
    // Arraylis<TreeNNode>pRes,
    public static boolean preOrder(TreeNode p,  TreeNode q) {
        if (p  == null && q ==null)
            return true;
        else if (p  == null && q !=null)
            return false;
        else if(p  != null && q ==null)
            return false;
        else if ( p.val != q.val)
            return false;

        // Visit the current node first
        //res.add(node.data);

        // Traverse the left subtree
        return preOrder(p.left, q.left) && preOrder(p.right, q.right);
  
    }
}
