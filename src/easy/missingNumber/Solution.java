package easy.missingNumber;

import java.util.Arrays;

// 剑指 Offer 53 - II. 0 到n-1中缺失的数字
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().missingNumber(new int[]{0}));
    }
    // 方法1二分查找
    /*
    public int missingNumber(int[] nums) {
        int begin,end,mid;
        begin = 0;
        end = nums.length;
        while (begin<end){
            // 中间数等于中间索引，说明缺的是后面的数，否则就是前面的数，
            // 不断查找直到，开始位置等与结束位置，得到结果
            mid = (begin+end)/2;
            if (nums[mid]==mid){
                begin = mid+1;
            }
            else
                end = mid;
        }
        return end;
    }
    */
    // 方法2 求和
    public int missingNumber(int[] nums) {
        //计算出0-n的和  n*(n+1)/2
        // n+1理论长度，n为头尾求和
        int sum_idea1 = nums.length*(nums.length+1)/2;
        int sum_real = Arrays.stream(nums).sum();
        return sum_idea1 - sum_real;
    }
}
