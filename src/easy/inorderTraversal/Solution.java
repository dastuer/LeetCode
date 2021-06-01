package easy.inorderTraversal;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 中序遍历二叉树
// 递归
class Solution {
//    public List<Integer> inorderTraversal(TreeNode root) {
//
//        ArrayList<Integer> res = new ArrayList<>();
//        if (root !=null){
//            if (root.left!=null)
//            res.addAll(inorderTraversal(root.left));
//            res.add(root.val);
//            if (root.right!=null)
//            res.addAll(inorderTraversal(root.right));
//            }
//            return res;
//    }
    // 基于栈
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> inS = new Stack<>();
        TreeNode cur  = root;
        while (!inS.isEmpty()||cur!=null){
            if (cur!=null){
                inS.push(cur);
                cur = cur.left;
            }
            else {
                cur = inS.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        return res;
    }
}
