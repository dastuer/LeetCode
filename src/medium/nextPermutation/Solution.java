package medium.nextPermutation;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,7,4,2};
        System.out.println(Arrays.toString(nums));
        Solution solution = new Solution();
        solution.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
/*
* leetcode 31题：需要将给定数字序列重新排列成字典序中下一个更大的排列
*  解题步骤：1.逆序查找满足右数num[i]大于左数num[i-1]条件的相邻数
*          2.从最右查找第一个大于num[i-1]的数，并将二者交换
*          3.将右数num[i]到末位数进行顺排
* */


    public void nextPermutation(int[] nums) {
        if (nums.length==1||nums==null){
            return;
        }
        for ( int i = nums.length - 1;i>0;i--){
            if (nums[i]>nums[i-1]) for (int j = nums.length - 1; j >= i; j--) {
                if (nums[j] > nums[i - 1]) {
                    int temp;
                    temp = nums[j];
                    nums[j] = nums[i - 1];
                    nums[i - 1] = temp;
                    Arrays.sort(nums,i,nums.length);
                    return;
                }
            }
        }
        Arrays.sort(nums);
        return;

    }
}
