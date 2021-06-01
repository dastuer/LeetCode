package medium.totalHammingDistance;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().totalHammingDistance(new int[]{4, 14, 2}));
    }
    /**
    总结
	1.  思路是:
    比如有3个数(用二进制表示) (方向从右到左<-，分别为第1位、第2位...)
    第一个数 a: 1 0 0 1
    第二个数 b: 0 1 1 1
    第三个数 c: 0 0 1 1
    那么第一位上的汉明距离总和是0。
    为什么？ 因为a、b、c该位全是"1"，任意两个"1"的汉明距离是0，所以该位汉明距离总和是0。
    接下来看第二位，a的第二位是"0"，b、c的是"1"，此时该位的汉明距离就是2。
    为什么？ 由上面我们可以得到，该位的"0"有1个，"1"有2个，而任意一个"0"都可以和任意一个"1"组合，
    一对组合可以产生的汉明距离为1，所以问题转换为了算多少对01组合，那么怎么计算呢？
    答案就是该位"0"的个数乘以"1"的个数。
    接下来看第三位，可以看出，此时"0"有2个，"1"有1个，所以可以产生的汉明距离为2。
    接下来看第四位，可以看出，此时"0"有2个，"1"有1个，所以可以产生的汉明距离为2。
    于是: 总的汉明距离就是 0 + 2 + 2 + 2 = 6
     **/
    /**
     * 将计算汉明距离简化成每一位的1和0的乘积之和
     * @param nums
     * @return
     */
    public int totalHammingDistance(int[] nums) {
        int res=0;
        for (int i = 0; i < 30; i++) {
            int count1 = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((nums[j]>>i)&1)>0){
                    count1++;
                }
            }
            res+=count1*(nums.length-count1);
        }
        return res;
    }
    public int hammingDistance(int x, int y){
        int z = x^y;
        int n = 0;
        while (z>0){
            if ((z&1)>0)
                n++;
            z = z>>1;
        }
        return n;
    }
}
