package medium.maxArea;
class Solution {
    public static void main(String[] args) {



        System.out.println(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));

    }
    public int maxArea(int[] height) {
        // 暴力算法不可取
//        int medium.maxArea = 0;
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i+1; j < height.length; j++) {
//                int minHeight= Math.min(height[i], height[j]);
//                int area = minHeight*(j-i);
//                if (medium.maxArea<area)
//                    medium.maxArea=area;
//            }
//        }
//        return medium.maxArea;

        // 双指针法
        // 一个指向头一个指向尾部
        // 指向小数的指针移动，因为此时小数限制了最大面积，因为高度和宽度都达到最大
        // 如果只移动大数指针，高度只会更小，并且宽度也在减小

        int maxArea=0;
        for (int i = 0,j = height.length-1; i<j;) {
          int area = Math.min(height[i],height[j])*(j-i);
          maxArea = Math.max(area,maxArea);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;



    }
}
