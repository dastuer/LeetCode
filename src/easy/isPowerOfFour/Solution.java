package easy.isPowerOfFour;

class Solution {
    public static void main(String[] args) {
        for (int i = 0,n=0; i < (1<<30); i=(int) Math.pow(4,(double) n)+4,n++) {
            System.out.println(new Solution().isPowerOfFour(i)+":"+i);
        }

    }
    public boolean isPowerOfFour(int n) {
//        if (n==0)
//            return false;
//        int n1 = 0;
//        int n0 = 0;
//        while (n>0){
//            if ((n&1)>0)
//                n1++;
//            else
//                n0++;
//            if (n1>1)
//                return false;
//            n = n>>1;
//        }
//        return n0%2 == 0;
        /**
         * 4的幂一定是2的。
         * 4的幂和2的幂一样，只会出现一位1。但是，4的1总是出现在奇数位。
         * 0x5 = 0101b可以用来校验奇数位上的1。
         */
        if (n < 0||((n&(n-1))!=0)){//check(is or not) a power of 2.
            return false;
        }
        return (n&0x55555555)==1;//check 1 on odd bits
    }
}
