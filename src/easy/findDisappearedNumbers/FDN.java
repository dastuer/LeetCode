package easy.findDisappearedNumbers;

import java.util.ArrayList;
import java.util.List;

public class FDN {
    public static void main(String[] args) {
        FDN fdn = new FDN();
        List<Integer> re = new ArrayList<>();
        int[] a = {1, 2, 3, 6, 4, 4};
        re = fdn.findDisappearedNumbers(a);
        System.out.println(re);

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                results.add(i + 1);
            }
        }
        return results;
    }
}
