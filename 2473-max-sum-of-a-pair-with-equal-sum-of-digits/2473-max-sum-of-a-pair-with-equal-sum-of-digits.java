class Solution {
    public int maximumSum(int[] nums) {
        int[] maxDigitSum = new int[82]; // Max digit sum can be 81 (for 999999999)
        int maxSum = -1;

        for (int num : nums) {
            int sum = 0, temp = num;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (maxDigitSum[sum] > 0) {
                maxSum = Math.max(maxSum, maxDigitSum[sum] + num);
            }

            maxDigitSum[sum] = Math.max(maxDigitSum[sum], num); 
        }

        return maxSum;
        }
       
}