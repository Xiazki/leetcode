package com.xiazki.leetcode.reverse;


import com.xiazki.leetcode.ListNode;

public class Lc206 {

    public ListNode reverseList(ListNode head) {

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
