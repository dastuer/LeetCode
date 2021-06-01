package easy.hammingDistance;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().hammingDistance(4, 1));
    }
    // 瀚明顿距离，两个数的二进制表示有几位不同
    // 先对两数异或，所有不同的位置都为1
    // 对异或结果与1进行与运算，再对异或结果右移位运算，直到0
    public int hammingDistance(int x, int y) {
        int z = x^y;
        int n=0;
        while (z>0){
            if ((z&1)>0)
                n++;
            z=z>>1;
        }
        return n;
    }

}
