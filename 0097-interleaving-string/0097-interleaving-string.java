class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;

        Boolean[][] memo = new Boolean[s1.length() + 1][s2.length() + 1];
        return helper(s1, 0, s2, 0, s3, 0, memo);
    }

    private boolean helper(String s1, int i, String s2, int j, String s3, int k, Boolean[][] memo) {
        if (i == s1.length() && j == s2.length() && k == s3.length()) {
            return true;
        }

        if (memo[i][j] != null) return memo[i][j];

        boolean fromS1 = false, fromS2 = false;

        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            fromS1 = helper(s1, i + 1, s2, j, s3, k + 1, memo);
        }

        if (j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            fromS2 = helper(s1, i, s2, j + 1, s3, k + 1, memo);
        }

        memo[i][j] = fromS1 || fromS2;
        return memo[i][j];
    }
}
