package medium.buildTree;

import java.util.Arrays;

// https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
// 剑指 Offer 07. 重建二叉树
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
// 方法1：递归构建
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 遍及结果为空返回空结束递归
        if (preorder.length==0){
            return null;
        }
        // 前序遍历结果第一个数是根节点
        int rootVal = preorder[0];
        // 对于中序遍历，根节点左边对应左子树，右边对应右子树
        // 获得根节点位置（rootIndex）后还可以获得左右子树的长度m和n
        // m = rootIndex,n = length - (rootIndex+1)
        // 获得左和右子树长度后，可以得到左右子树的前序遍历结果
        // 左子树前序遍历结果为原树前序遍历结果的第一个数后后面m个数，右子树为剩下的数
        int rootIndex = 0;
        // 确定根节点在中序遍历的位置
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i]==rootVal){
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        // 得到根节点的前序遍历和中序遍历结果后，递归构建左右子树
        root.left = buildTree(
                // 左子树的前序遍历结果，即原来前序遍历的根节点（第一个数）开始m个数
                Arrays.copyOfRange(preorder,1,rootIndex+1),
                // 左子树的中序遍历结果，0->rootIndex
                Arrays.copyOfRange(inorder,0,rootIndex));
        root.right = buildTree(
                Arrays.copyOfRange(preorder, rootIndex+1,preorder.length),
                Arrays.copyOfRange(inorder,rootIndex+1,inorder.length));
        return root;
    }
}

