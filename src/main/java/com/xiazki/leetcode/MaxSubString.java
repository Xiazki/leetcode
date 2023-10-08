package com.xiazki.leetcode;

import java.util.Objects;

public class MaxSubString {

    public int getMax(String in) {

        int max = 0;
        int count = 0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) != ' ') {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return Math.max(count, max);
    }

    public static void main(String[] args) {
        int max = new MaxSubString().getMax("asdfadsf asd    324dvsdfgvlkdsfsdsdfjgsodflskdfgs");
        System.out.println(max);

    }
}
