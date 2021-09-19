package medium.permute;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
// leetcode 46 全排列
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        ArrayDeque<Integer> path = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[len];
        dfs(nums,path,len,0,used,res);
        return res;
    }
    // 回溯算法
    public void dfs(int[] nums,ArrayDeque<Integer> path ,int len ,int depth ,boolean[] used,List<List<Integer>> res){
        // 递归结束条件：递归深度等于数组长度
        if (depth==len){
            res.add(new ArrayList<>(path));
        }else {
            for (int i = 0; i < len; i++) {
                // 将一个未被使用的数字添加到路径当中，使用情况取反
                if (!used[i]){
                    path.addLast(nums[i]);
                    used[i]=true;
                    dfs(nums,path,len,depth+1,used,res);
                    // 一次递归结束后，将路径末尾数字移除，使用情况改为未使用
                    used[i] = false;
                    path.removeLast();
                }
            }
        }
    }
}
