package easy.isValid;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("({{}()[{]})}"));
    }

    public boolean isValid(String s) {
        int length = s.length()/2;
        for (int i = 0; i < length;i++) {
            s = s.replace("{}","").replace("()","").replace("[]","");
        }
        return s.length()==0;
    }
    public boolean isValid2(String s){
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c=='(')
                stack.push(')');
            else if (c=='{')
                stack.push('}');
            else if (c=='[')
                stack.push(']');
            else if (stack.isEmpty()||stack.pop()!=c)
                return false;
        }
        return stack.isEmpty();
    }
}
