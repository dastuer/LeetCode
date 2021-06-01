package easy.romanToInt;

public class Solution {
    public static void main(String[] args) {
       Solution solution =   new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
    public int romanToInt(String s) {
        int sum = 0;
        int num;
        num = this.getValue(s.charAt(0));
        for (int i = 0; i < s.length()-1; i++) {
           int  afterNum = this.getValue(s.charAt(i+1));
            if (afterNum > num)
                sum -= num;
            else
                sum += num;
             num = afterNum;
        }
        return sum+num;
    }
    public int getValue(char ch){
        int value = 0;
        switch (ch){
            case 'I': value = 1;break;
            case 'V': value = 5;break;
            case 'X': value = 10;break;
            case 'L': value = 50;break;
            case 'C': value = 100;break;
            case 'D': value = 500;break;
            case 'M': value = 1000;break;
            default:return 0;
        }
        return value;
    }
}
