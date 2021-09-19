package easy.findRepeatNumber;

import java.util.HashSet;

class Solution {
    /* 集合，简单粗暴
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return num;
            else
                set.add(num);
        }
        return nums[nums.length-1];
    }
     */

    /**
     * 原地哈希表，用另外一个数组统计原数组当中每个数字出现次数
     *
     */
    public int findRepeatNumber(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums) {
            int times = ++arr[num];
            if (times > 1) return num;
        }
        return -1;
    }
}
