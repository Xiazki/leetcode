package com.xiazki.leetcode;

import java.util.Objects;

public class Lc5 {

    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        if (s.length() <= 1) {
            return s;
        }
        String max = "";
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && Objects.equals(s.charAt(left), s.charAt(right))) {
                left--;
                right++;
            }
            int len = right - left - 1;
            if (len > max.length()) {
                max = s.substring(left, right);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Lc5().longestPalindrome("dasdfadabacc"));
    }

}
