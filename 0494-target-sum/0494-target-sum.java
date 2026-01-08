class Solution {
    int[][] dp;
    int totalSum;

    private int recurse(int i, int sum, int[] nums, int target) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }

        int idx = sum + totalSum;
        if (dp[i][idx] != -1)
            return dp[i][idx];

        int add = recurse(i + 1, sum + nums[i], nums, target);
        int sub = recurse(i + 1, sum - nums[i], nums, target);

        return dp[i][idx] = add + sub;
    }

    public int findTargetSumWays(int[] nums, int target) {
        totalSum = 0;
        for (int x : nums) totalSum += x;

        dp = new int[nums.length][2 * totalSum + 1];
        for (int i = 0; i < nums.length; i++)
            Arrays.fill(dp[i], -1);

        return recurse(0, 0, nums, target);
    }
}

