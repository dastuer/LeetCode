package medium.rotate;

import java.util.Arrays;
/* 题目：给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
* 题解：1.矩阵上下交换
*      2.矩阵对角交换
* */
public class Solution {
    public static void main(String[] args) {
        int[][] a;
        a= new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        System.out.println(a.length);
        Solution solution = new Solution();
        solution.rotate(a);
        System.out.println(Arrays.deepToString(a));

    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; n / 2 > i; i++) {
            int temp;
            for (int j = 0; j < matrix.length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
            System.out.println(Arrays.deepToString(matrix));
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
}

