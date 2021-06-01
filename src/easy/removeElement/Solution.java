package easy.removeElement;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[]{2, 3,7, 2,7,2,10, 5,2}, 2));

    }
    // 遍历覆盖前面的数
    public int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[n]=nums[i];
                n++;
            }
        }
//        System.out.println(Arrays.toString(nums));
        return n;
    }

}
