package easy.strStr;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("aaabb", "abb"));


    }
    public int strStr(String haystack, String needle) {
        // 初始条件判断
        if (needle.length()==0)
            return 0;
        else if (haystack.length()<needle.length())
            return -1;
        char[] str1 = haystack.toCharArray();
        char[] str2 = needle.toCharArray();
        // 遍历从0到二者长度之差加一的位置,因为如果字串出现在查找字符串的末尾，则必须遍历到字串位置
        // 但是如果全部遍历，可能会在后序指针移动过程中出现下标越界的情况
        for (int i = 0; i < str1.length-str2.length+1;i++) {
            // 指针j指向字串，每次循环回到头部
            int j =0;
            // 指针index指向查找字符串遍历的位置
            int index = i;
            // 判断两个指针的指向的数是否相同
            while (str1[index] == str2[j]){
                // 如果相同，且指针j达到字串的末尾，则返回遍历的位置i
                if (j==str2.length-1) {
                    return i;
                }
                // 未到达两个指针前移
                index++;
                j++;
            }
        }
        return -1;
    }
}
