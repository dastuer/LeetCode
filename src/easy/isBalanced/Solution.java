package easy.isBalanced;

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
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        // 判断左右节点是否平衡
        boolean flag = Math.abs(depth(root.left)-depth(root.right)) <= 1;
        // 如果平衡且所有子节点平衡则返回true
        return flag&&isBalanced(root.left)&&isBalanced(root.right);
    }
    // 计算左右子树的深度
    public int depth(TreeNode root){
        // 递归计算左右子树的深度，递归到空节点时返回0
        if (root==null)
            return 0;
        int ld = depth(root.left);
        int rd = depth(root.right);
        // 每递归一次加一，计算深度
        return Math.max(ld,rd)+1;
    }
}
