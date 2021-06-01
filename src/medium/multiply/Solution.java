package medium.multiply;

/**给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * 解题思路：将乘法分解为对应位的乘积，将相同位乘积的数相加放在一个数组中
 */
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().multiply("408", "5"));
        System.out.println(408*5);
    }
    public String multiply(String num1, String num2) {

        int l1 = num1.length();
        int l2 = num2.length();
        int[] resInt = new int[l1 + l2];

        for (int i = 0; i <l1 ;i++) {
            for (int j = 0; j <l2; j++) {
                resInt[i+j] += (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }
        // 从数组末尾向前进行进位处理，保存最高位的进位
        int ca = 0;
        for (int i = resInt.length - 1; i >= 0; i--) {
            int ca_next = (resInt[i]+ca)/10;
            resInt[i] = (ca+resInt[i])%10;
            ca = ca_next;
        }
//        for (int i = 0; i < resInt.length; i++) {
//            System.out.print(resInt[i]+"\t");
//        }
//        System.out.println();
        StringBuilder resStr = new StringBuilder();
        // 最高位进位不为0时，先拼接最高位
        if (ca!=0){
            resStr.append(ca);
        }
        // 跳过高位的0，直到最后一位之前
        int i = 0;
        while (ca==0&&resInt[i]==0&&i!=resInt.length-2) {
            i++;
        }
        // 从低到高拼接剩余数字
        for (; i < resInt.length-1; i++){
                resStr.append(resInt[i]);
        }
        return resStr.toString();
    }
}
