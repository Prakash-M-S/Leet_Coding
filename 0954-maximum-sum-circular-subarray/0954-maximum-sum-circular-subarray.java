class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0], curMax = 0;
    int minSum = nums[0], curMin = 0;
    int totalSum = 0;

    for (int num : nums) {
        totalSum += num;


        curMax = Math.max(num, curMax + num);
        maxSum = Math.max(maxSum, curMax);


        curMin = Math.min(num, curMin + num);
        minSum = Math.min(minSum, curMin);
    }


    return (maxSum > 0) ? Math.max(maxSum, totalSum - minSum) : maxSum;

    }}