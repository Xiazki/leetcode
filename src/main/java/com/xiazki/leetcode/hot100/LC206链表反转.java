package com.xiazki.leetcode.hot100;


/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */
public class LC206链表反转 {
    /*
     *  典型的解法是使用双指针：
     *
     *  定义当前指针curNode和前置指针preNode
     *  遍历链表，每次将curNode的next设置为preNode即可
     * 然后再将指针前移，注意要定义临时变量将下一个节点存下来。
     *
     */
}


class Solution_LC206 {
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        while (curNode!=null){
            ListNode temp = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = temp;
        }
        return preNode;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}