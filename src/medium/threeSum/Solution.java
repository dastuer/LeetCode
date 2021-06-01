package medium.threeSum;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,0,0};
//                {-13,5,13,12,-2,-11,-1,12,-3,0,-3,-7,-7,-5,-3,-15,-2,14,14,13,6,-11,-11,5,-15,-14,5,-5,-2,0,3,-8,-10,-7,11,-5,-10,-5,-7,-6,2,5,3,2,7,7,3,-10,-2,2,-12,-11,-1,14,10,-9,-15,-8,-7,-9,7,3,-2,5,11,-13,-15,8,-3,-7,-12,7,5,-2,-6,-3,-10,4,2,-5,14,-3,-1,-10,-3,-14,-4,-3,-7,-4,3,8,14,9,-2,10,11,-10,-4,-15,-9,-1,-1,3,4,1,8,1};
        List<List<Integer>> lists = solution.threeSum(nums);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }


    }
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new LinkedList<>();
        // 先将数组进行排序，便于查找
        Arrays.sort(nums);
        // 双指针法
        for (int i = 0; i < nums.length-2; i++) {
            // 从0到倒数第三个数依次扫描，如果本次扫描的数和上次的相同，则跳过本次扫描
            if (i>0&&nums[i]==nums[i-1])continue;
            // 左指针，右指针
            int left = i+1;
            int right = nums.length-1;
            // 左右指针向前
            while (left < right){
                // 扫描到和为0的3个数，将其放入结果列表中
                if (nums[i]+nums[left]+nums[right]==0){
                    result.add(new LinkedList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    // 两个指针分别向前和向后，扫描到相同的数值时，指针不断向前
                    while (nums[left]==nums[left+1]&&(left < right)&&(left<nums.length-2)) {
                        left++;
                    }
                    // 未扫描到相同的值时，左指针向前，右指针向后移动一位
                    left++;
                    while (nums[right]==nums[right-1]&&(left < right)){
                        right--;
                    }
                    right--;
                }
                // 扫描结果大于0时，右指针向左扫描直到扫描到不同的数，找寻更小的数
                else if (nums[i]+nums[left]+nums[right] > 0){
                    while (nums[right]==nums[right-1]&&(left < right)) {
                        right--;
                    }
                    right--;
                }
                // 扫描结果小于0时，右指针向后扫描直到扫描到不同的数，找寻更大的数
                else {
                    while (nums[left]==nums[left+1]&&(left < right)&&(left<nums.length-2)){
                    left++;
                    }
                    left++;
                }
            }
        }
        return result;
    }
}
