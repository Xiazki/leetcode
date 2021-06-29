package com.xiazki.leetcode.doublepoint;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 示例 2：
 * <p>
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出：[1]
 */
public class Lc88 {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i = 0, j = 0, k = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (i < m || j < n) {
            if (i == m){
                cur = nums2[j++];
            }else if (j == n){
                cur = nums1[i++];
            }else if (nums1[i] < nums2[j]) {
                cur = nums1[i++];
            } else {
                cur = nums2[j++];
            }
            sorted[i+j-1] = cur;
        }
        for (int i1 = 0; i1 < nums1.length; i1++) {
            nums1[i1] = sorted[i1];
        }
    }

    public static void main(String[] args) {

        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};
        new Lc88().merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }

}
