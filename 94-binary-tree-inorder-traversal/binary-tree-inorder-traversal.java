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
    List li = new ArrayList();
    
    public List<Integer> inorderTraversal(TreeNode root) {

        // LNR
        if(root != null && root.left != null)
            inorderTraversal(root.left);
        if(root != null)
            li.add(root.val);
        if(root != null && root.right != null)
            inorderTraversal(root.right);

        return li;
    }
}