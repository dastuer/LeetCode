package easy.replaceSpace;

class Solution {
    // https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (' '==s.charAt(i)){
                sb.append("%20");
            }else {
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}
