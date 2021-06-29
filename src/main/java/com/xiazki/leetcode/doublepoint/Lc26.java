package com.xiazki.leetcode.doublepoint;

import java.util.Arrays;

/**

 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。

 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

 输入：nums = [1,1,1,1,2,2]
 输出：2, nums = [1,2]
 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
public class Lc26 {
    public int removeDuplicates(int[] nums) {
        int lift = 1,right = 1;
        if (nums.length<1){
            return lift;
        }
        while (right<nums.length){
            if (nums[right]!=nums[lift-1]){
                nums[lift]=nums[right];
                lift++;
            }
            right++;
        }
        return lift;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,1,1,1,2,2,3};
        int len = new Lc26().removeDuplicates(array);
        System.out.println(len);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
