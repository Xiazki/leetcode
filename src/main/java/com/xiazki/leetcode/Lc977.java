package com.xiazki.leetcode;

import java.util.Arrays;

/**
 * 977. 有序数组的平方
 *
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 *
 *
 * 示例 1：
 *
 * 输入：nums = [-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 解释：平方后，数组变为 [16,1,0,9,100]
 * 排序后，数组变为 [0,1,9,16,100]
 * 示例 2：
 *
 * 输入：nums = [-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 *
 * 提示：
 *
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums 已按 非递减顺序 排序
 *  
 *
 * 进阶：
 *
 * 请你设计时间复杂度为 O(n) 的算法解决本问题
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class Lc977 {

    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        int low = 0,high = nums.length-1,flag = nums.length-1 ;
        while (low<=high){
            if (nums[low] * nums[low] < nums[high] * nums[high]){
                sorted[flag] = nums[high] * nums[high];
                high --;
            }else {
                sorted[flag] = nums[low] * nums[low];
                low ++;
            }
            flag --;
        }
        return sorted;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Lc977().sortedSquares(new int[]{-7,-3,2,3,11})));
    }
}
