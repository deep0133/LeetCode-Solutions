class Solution {
    public int getLength(int count) {
        if (count == 1) return 1;
        else if (count < 10) return 2;
        else if (count < 100) return 3;
        else return 4;
    }

    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length();
        int[][] dp = new int[n + 1][k + 1];

        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= k; j++) {
                if (i == n) {
                    dp[n][j] = 0;
                    continue;
                }
                dp[i][j] = (j > 0) ? dp[i + 1][j - 1] : Integer.MAX_VALUE;
                int del = j, count = 0;
                for (int l = i; l < n && del >= 0; l++) {
                    if (s.charAt(l) == s.charAt(i)) {
                        count++;
                        dp[i][j] = Math.min(dp[i][j], getLength(count) + dp[l + 1][del]);
                    } else {
                        del--;
                    }
                }
            }
        }
        return dp[0][k];
    }
}