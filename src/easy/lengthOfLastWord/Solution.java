package easy.lengthOfLastWord;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord(""));
    }

    /**给你一个字符串 s，由若干单词组成，单词之间用空格隔开。
     * 返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
     * 末尾的空格不代表最后一个单词长度为0
     *
     * 解题思路
     * 从末尾第一个不为空格的位置开始计数，直到遇到空格退出计数
     */
    public int lengthOfLastWord(String s) {
        //
        int n = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i)!=' '){
                n ++;
            }
            if (s.charAt(i)==' '&&n>0)break;
        }
        return n;
    }
}
