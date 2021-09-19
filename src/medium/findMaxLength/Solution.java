package medium.findMaxLength;

import java.util.HashMap;

// LeetCode 525. 连续数组 与523题的思路类似
class Solution {
    public int findMaxLength(int[] nums) {
        int res = 0;
        // 将0翻转成-1，依次计算0-n的数组的和
        // 如果i、j位置的和相等，说明i到j的数字的和为0，即代表01的个数相同
        // 523 题i，j位置的模值相等，中间值的和对数k的模必为0，即中间数的和为k的整数倍
        // 计算i到j之间的距离即可求得一个结果，返回所有结果的最大值
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] == 0)
               nums[i]=-1;
        }
        // 利用map存储和以及下标
        // -1下标用于处理和为0的情况，即对于任何和为0的i值，返回长度为i+1
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)){
                res = Math.max((i-map.get(sum)),res);
            }
            else
                map.put(sum,i);
        }
        return res;
    }
}
