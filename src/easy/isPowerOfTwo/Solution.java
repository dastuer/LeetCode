package easy.isPowerOfTwo;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(2));

    }
    public boolean isPowerOfTwo(int n) {
        int x = 0;
        while (n>0){
            if ((n&1)>0)
                x += 1;
            if (x>1)
                return false;
            n = n >> 1;
        }
        return x==1;
    }
}
