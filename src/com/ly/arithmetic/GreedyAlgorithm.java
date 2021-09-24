package com.ly.arithmetic;

import java.util.Arrays;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int i = minMoves(arr);
        System.out.println(i);
    }

    /**
     * 给定一个长度为 n 的 非空 整数数组，每次操作将会使 n - 1 个元素增加 1。找出让数组所有元素相等的最小操作次数。
     * 输入：
     * [1,2,3]
     * 输出：
     * 3
     * 解释：
     * 只需要3次操作（注意每次操作会增加两个元素的值）：
     * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
     * @param nums
     * @return s
     */
    public static int minMoves(int[] nums) {

        Arrays.sort(nums);
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i] - nums[0];
        }
        return s;
    }



}
