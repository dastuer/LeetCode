package easy.maxSubArray;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{-10,1,2,3,-1,3}));
    }

    /**
     * 对于含有正数的序列而言,最大子序列肯定是正数,所以头尾肯定都是正数.
     * 我们可以从第一个正数开始算起,每往后加一个数便更新一次和的最大值;
     * 当当前和成为负数时,则表明此前序列无法为后面提供最大子序列和,因此必须重新确定序列首项.
     * https://www.cnblogs.com/sunnysola/p/4795691.html
     */
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum=0;
        for (int num : nums) {
            if (sum > 0){
                sum+=num;
            }
            else {
                sum = num;
            }
            res = Math.max(sum,res);
        }
        return res;
    }
}
