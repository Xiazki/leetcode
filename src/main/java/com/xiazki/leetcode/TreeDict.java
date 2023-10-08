package com.xiazki.leetcode;


public class TreeDict {

    private static final String REGEX_CHAR = "^[A-Za-z]+$";

    private static final char START = 'a';

    private TreeNode root;

    private int deep;

    public static final int SIZE = 26;


    public TreeDict() {
        this.root = new TreeNode();
    }

    public void addWord(String word) {
        if (!check(word)) {
            return;
        }
        TreeNode node = root;
        char[] words = word.toLowerCase().toCharArray();
        for (char c : words) {
            int pos = c - START;
            TreeNode charNode = node.son[pos];
            if (charNode == null) {
                node.son[pos] = new TreeNode(c);
                node.son[pos].deep = node.deep + 1;
            } else {
                node.son[pos].deep++;
            }
            node = node.son[pos];
        }

        node.isEnd = true;
        node.count++;

    }

    public long getWordCount(String word) {
        if (!check(word)) {
            return 0;
        }
        char[] chars = word.toLowerCase().toCharArray();
        TreeNode node = root;
        for (char aChar : chars) {
            int pos = aChar - START;
            TreeNode treeNode = node.son[pos];
            if (treeNode == null) {
                return 0;
            } else {
                node = node.son[pos];
            }
        }
        return node.count;
    }

    public boolean findWord(String word) {
        if (!check(word)) {
            return false;
        }
        char[] chars = word.toLowerCase().toCharArray();
        TreeNode node = root;
        for (char aChar : chars) {
            int pos = aChar - START;
            TreeNode treeNode = node.son[pos];
            if (treeNode == null) {
                return false;
            } else {
                node = node.son[pos];
            }
        }
        return true;
    }

    private boolean check(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        return word.matches(REGEX_CHAR);
    }


    private class TreeNode {

        private boolean isEnd;
        private char value;
        private TreeNode[] son;
        private long count;
        private long deep;

        public TreeNode() {
            this.son = new TreeNode[SIZE];
        }

        public TreeNode(char c) {
            this.value = c;
            this.son = new TreeNode[SIZE];
        }

    }

}

