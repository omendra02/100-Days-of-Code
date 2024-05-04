package Day7583;

public class Q4 {
    class Solution {
        public int maximalSquare(char[][] matrix) {
            // DP Approach
            int m = matrix.length, n = matrix[0].length;
            // dp[i][j] stands for the length of the largest square
            // with [i][j] at the bottom-right corner
            // TC: O(mn) SC: O(mn) -> can be optimized to O(n)
            int[][] dp = new int[m][n];
            int maxLen = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == '0') {
                        continue;
                    }
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                    }
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
            // Return the largest area
            return maxLen * maxLen;
        }
    }
}
