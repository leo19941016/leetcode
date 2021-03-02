package com.tang.leetcode;

/**
 * @Description:
 * @Company: TOO (ps：公司名称)
 * @author: 唐
 * @date: 2021/3/2 下午1:11
 * @version: V1.0.0
 */
public class Coding {


    /*题库来源：https://leetcode-cn.com/problems/add-two-numbers/*/

    public static void main(String[] args) throws Exception {

        /*question1:  给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。

            你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。*/

        /*getTwo(new int[]{1, 3, 5}, 8);*/


        /*question2:给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

                请你将两个数相加，并以相同形式返回一个表示和的链表。

                你可以假设除了数字 0 之外，这两个数都不会以 0 开头。*/


        /*getTwo2(new ListNode(2, new ListNode(3)), new ListNode(3));*/


    }


    // question 2
    private static ListNode getTwo2(ListNode l1, ListNode l2) {

        ListNode root = new ListNode(0);
        ListNode consum = root;
        int a = 0;

        while (l1 != null || l2 != null || a > 0) {

            int l1val = l1 == null ? 0 : l1.val;
            int l2val = l2 == null ? 0 : l2.val;

            a = (l1val + l2val + a) / 10;  //下一节点的进位数

            ListNode b = new ListNode((l1val + l2val + a) % 10); //该节点的val
            consum.next = b;
            consum = b;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

        }

        return root.next;
    }


    // question 2 bean
    public static class ListNode {
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

    // question 1
    private static int[] getTwo(int[] a, int b) throws Exception {


        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]) == b) {
                    return new int[]{i, j};
                }
            }
        }

        throw new Exception("input data error");
    }
}
