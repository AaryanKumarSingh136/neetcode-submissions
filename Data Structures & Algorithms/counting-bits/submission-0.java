public class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int o = 1;

        for (int i = 1; i <= n; i++) {
            if (o * 2 == i) {
                o = i;
            }
            dp[i] = 1 + dp[i - o];
        }
        return dp;
    }
}