package easy.searchInsert;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1, 2, 3, 4, 5}, 6));

    }
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int mid = 0;
        while (low<high){
            mid = low + (high-low)/2;
            if (nums[mid]==target)
                return mid;
            else if (nums[mid]>target)
                high = mid;
            else if (nums[mid]<target)
                low = mid+1;
            }
        return low;
    }
}
