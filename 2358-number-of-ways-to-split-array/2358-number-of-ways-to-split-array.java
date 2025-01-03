class Solution {
    public int waysToSplitArray(int[] nums) {
     int count = 0;
    long totalSum = 0, prefixSum = 0;

    for (int num : nums) {
        totalSum += num;
    }

    for (int i = 0; i < nums.length - 1; i++) {
        prefixSum += nums[i];
        if (prefixSum >= totalSum - prefixSum) {
            count++;
        }
    }

    return count;
    }

}