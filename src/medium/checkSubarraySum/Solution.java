package medium.checkSubarraySum;

import java.util.HashMap;

// LeetCode 523


/**
 在每个索引位置i, 计算当前和对k的mod值, 假设在索引x处, sum[0~x] = m*k + mod_x;
 在索引y处, sum[0~y] = n*k + mod_y; 如果mod_x == mod_y且y-x > 1说明sum[x~y]
 即为一个符合要求的连续子数组, 用map来保存每个mod值对应的索引, 一旦出现新的mod值出现
 在map中, 判断索引差是否大于1.
 注意特殊情况:
 1) 当nums中有连续0, 无论k为何值都是正确的;
 2) 除情况1之外出现k为0都是错误的;
 3) k为负数也是可能的, 但是要将其变为对应正数来求mod.
 此外需要在map中初始化<0,-1>, 其原因在于解决到达某个i时sum恰好可以整除k的情况, 选择-1
 的原因是要求连续子数组长度大于等于2, 这样可以避免第一个数字为0的情况
 **/

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // 判断边界条件
        if (nums.length<2)
            return false;
        // 连0是任何数的整数倍
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        // 只有一个0且目标为0时无结果
        if(k == 0) return false;
        // k为负数时转化为正数处理
        if(k<0)k=-k;


        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        int mod;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            mod = sum%k;
            if (map.containsKey(mod)){
                if ((i-map.get(mod))>1)
                    return true;
            }else
                map.put(mod,i);
        }
        return false;
    }
}
