package easy.purchasePlans;

import java.util.Arrays;
// LCP 28. 采购方案
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().purchasePlans(new int[]{0}, 7));
    }
    public int purchasePlans(int[] nums, int target) {
        int res = 0;
        Arrays.sort(nums);
        int j = nums.length - 1;
        for (int i = 0; i < nums.length-1; i++) {
            while (i < j) {
                if (nums[j] + nums[i] <= target) {
                    res = ((j - i) + res)%1000000007;
                    break;
                } else j--;
            }
            if (i>j)break;
        }
        return res;
    }
}
