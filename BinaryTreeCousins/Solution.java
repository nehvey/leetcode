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
    public boolean isCousins(TreeNode root, int x, int y) {
        return isCousins(root, x, y, 0) == 100;
    }
    
    private int isCousins(TreeNode root, int x, int y, int d) {
        if (root == null) {
            return -1;
        }
        if ((root.val == x || root.val == y) && d != 0) {
            return d;
        }
        int l = isCousins(root.left, x, y, d + 1);
        int r = isCousins(root.right, x, y, d + 1);
        return l == r && l - d > 1 ? 100 : Math.max(l, r);
    }
}
