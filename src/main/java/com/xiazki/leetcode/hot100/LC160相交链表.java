package com.xiazki.leetcode.hot100;


/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 */
public class LC160相交链表 {
    /**
     * 这题也是用双指针解决
     * 分别定义两个指针pa，pb指向a链和b链接的头
     * 假设a链的长度为m b链的长度为n，那么
     * 那pa和pb都走了m+n之后 如果相交那么此时pa=pb，不相交则pa和pb都为null
     * 要实现pa和pb都走m+n，当pa走到a链的头时，要从b链的头开始，pb也是如此
     */
}

class Solution_LC160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb) {
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
    }
}