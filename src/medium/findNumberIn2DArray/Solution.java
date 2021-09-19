package medium.findNumberIn2DArray;

public class Solution {
    // https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
    // 方法1
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0||matrix[0].length==0){
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (target>matrix[i][matrix[i].length-1]){
                continue;
            }
            if (target<matrix[i][0]){
                return false;
            }
            if (binaryFind(matrix[i],target)){
                return true;
            }
        }
        return false;
    }
    // 方法2
    // 对于任意一个数，下面的更大，左边的更小
    // 根据此规律，从右上角开始查找
    public boolean findNumberIn2DArray1(int[][] matrix, int target) {
        if (matrix.length==0||matrix[0].length==0){
            return false;
        }
        int col = matrix[0].length;
        int row = matrix.length;
        // m,n 标记初始位置
        int m = 0;
        int n = col -1;
        while (m<row&&n>0){
            if (matrix[m][n]==target){
                return true;
            }
            else if (matrix[m][n]<target){
                m++;
            }
            else {
                n--;
            }
        }
        return false;
    }



    private boolean binaryFind(int[] matrix,int target) {
        int low = 0;
        int high = matrix.length-1;
        while (low<=high){
            int mid = (high+low)/2;
            if (matrix[mid]==target){
                return true;
            }
            else if (matrix[mid]>target){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return false;
    }
}
