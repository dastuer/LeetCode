package easy.replaceDigits;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().replaceDigits("a1"));
    }
    public String replaceDigits(String s) {
        char[] res = s.toCharArray();
        for (int i = 1; i < s.length(); i+=2) {
            res[i] = (char)(res[i]+res[i-1]-'0');
        }
        return String.valueOf(res);
    }
}
