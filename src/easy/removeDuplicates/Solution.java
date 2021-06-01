package easy.removeDuplicates;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==1)
            return nums.length;
        int j = 1;
        int i = 0;
        while (j< nums.length){
            if(nums[i]==nums[j]) {
            }
            else {
                i++;
                nums[i]=nums[j];

            }
            j++;
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,5,6,6,7};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));

    }
}
