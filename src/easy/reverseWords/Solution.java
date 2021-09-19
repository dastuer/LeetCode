package easy.reverseWords;

import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords(" I   am   You"));
    }



    public String reverseWords(String s) {

        // 双指针法
        StringBuilder res = new StringBuilder();
        int i = s.length() - 1, j = i;
        while (i >= 0){
            while (i >= 0&&s.charAt(i) == ' ')
                i--;
            // 最后的空格全部跳过后直接退出循环
            if(i<0)break;
            j = i;
            while (j>=0&&s.charAt(j) != ' ')
                j--;
            res.append(s, j+1, i+1);
            res.append(' ');
            i=j;
        }
        if(res.length()>0)
            res.deleteCharAt(res.length()-1);
        return res.toString();
    }









        /* 栈
        Stack<String> strings = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                StringBuilder str = new StringBuilder();
                while (i < s.length() && s.charAt(i) != ' ') {
                    str.append(s.charAt(i));
                    i++;
                }
                strings.push(str.toString());
            }
        }
        StringBuilder res = new StringBuilder();
        System.out.println(strings.size());

        while (!strings.isEmpty()){
            String temp = strings.pop();
            System.out.println(temp);
            res.append(temp);
            if (!strings.isEmpty())
                res.append(' ');
        }
        return res.toString();
    }
     */

    }

