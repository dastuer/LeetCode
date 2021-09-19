package easy.numWays;
// 剑指 Offer 10 - II. 青蛙跳台阶问题
class Solution {
    public int numWays(int n) {
        if(n<=1)
            return 1;
        int[] res = new int[n+1];
        res[1] = 1;
        res[0] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = (res[i-1]+ res[i-2])%1000000007;
        }
        return res[n];
    }
}
