package easy.isPalindrome;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(81218));
    }
    public boolean isPalindrome(int x) {
//        // 垃圾方法
//        if (x<0){
//            return false;
//        }
//        Stack<Integer> ints = new Stack<>();
//        ArrayList<Integer> ints1 = new ArrayList<>();
//        while (x>0){
//            ints.push(x%10);
//            ints1.add(x%10);
//            x/=10;
//        }
//        int n = 0;
//        while (ints.size()!=0){
//           if (!ints.pop().equals(ints1.get(n++)))
//               return false;
//        }
//        return true;
//    }

        if (x<0)
            return false;
        int remain = 0;
        int y=0;
        int temp = x;
        // 实现将x逆置
        //  每次将上次的逆置结果余数*10再加上本次的余数
        while (x>0){
            remain = x%10;
            y = y*10+remain;
            x/=10;
        }
        // 判断逆置的结果与原数相等
        return y==temp;


        // 简化版
//        int temp=x;
//        x=Math.abs(x);
//        int res=0;
//        for (;x>0;res=res*10+x%10,x/=10);
//        return temp==res;



    }





}
