package easy.hammingWeight;

public class Solution {
    // you need to treat n as an unsigned value
    //判断时要判断 n != 0 而不是 n>0 。 因为是无符号整数，带符号整数最高位是1时为负数。
    //要用 n >>> 1 而不是 n >> 1。因为>>是带符号右移，当n为负数时，最高位补1
    public int hammingWeight(int n) {
        int count=0;
        while (n!=0){
            if ((n&1)==1)
                count++;
            n = n>>>1;
        }
        return count;
    }
}
