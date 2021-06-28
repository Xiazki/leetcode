package com.xiazki.leetcode.slowfast;

import java.util.List;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc243 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode cur = head;
        while (fast.next!=null){
            slow = slow.next;
            fast =fast.next.next;
            if (fast == null){
                fast = fast.next;
            }
        }
        ListNode secondHalf = reverseList(slow.next);
        ListNode flag = secondHalf;
        while (flag!=null){
            if (cur.val!=flag.val){
                return false;
            }
            cur = cur.next;
            flag = flag.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
}
