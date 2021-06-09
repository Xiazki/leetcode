package com.xiazki.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 997. 找到小镇的法官
 * <p>
 * 在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。
 * <p>
 * 如果小镇的法官真的存在，那么：
 * <p>
 * 小镇的法官不相信任何人。
 * 每个人（除了小镇法官外）都信任小镇的法官。
 * 只有一个人同时满足属性 1 和属性 2 。
 * 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。
 * <p>
 * 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：N = 2, trust = [[1,2]]
 * 输出：2
 * 示例 2：
 * <p>
 * 输入：N = 3, trust = [[1,3],[2,3]]
 * 输出：3
 * 示例 3：
 * <p>
 * 输入：N = 3, trust = [[1,3],[2,3],[3,1]]
 * 输出：-1
 * 示例 4：
 * <p>
 * 输入：N = 3, trust = [[1,2],[2,3]]
 * 输出：-1
 * 示例 5：
 * <p>
 * 输入：N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
 * 输出：3
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-town-judge
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Lc997 {

    /**
     * @param n
     * @param trust
     * @return
     */
    public int findJudge(int n, int[][] trust) {
        Set<Integer> par = new HashSet<>();
        for (int[] ints : trust) {
            if (par.contains(ints[0])) {
                par.remove(ints[0]);
            } else par.add(ints[1]);
        }
        if (par.size()>1){
            return -1;
        }
        for (Integer integer : par) {
            return integer;
        }
        return -1;
    }

    public int findJudge2(int n, int[][] trust) {
       int[][] pre = new int[n][2];
        for (int[] ints : trust) {
            pre[ints[0] -1][0]++;
            pre[ints[1] -1][1]++;
        }
        for (int i = 0; i < pre.length; i++) {
            if (pre[i][0] == 0 && pre[i][1] == n-1){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Lc997().findJudge2(4,new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}}));
    }

}
