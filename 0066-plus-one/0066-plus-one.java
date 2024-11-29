class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                int i2 = 0;
                while (i2 < digits.length && digits[i2] == 0) {
                    i2++;
                }
                int[] result = new int[digits.length - i2];
                System.arraycopy(digits, i2, result, 0, result.length);
                return result;
            }
            digits[i] = 0;
        }
        
        int[] result = new int[n + 1];
        result[0] = 1;
        
        int i2 = 0;
        while (i2 < result.length && result[i2] == 0) {
            i2++;
        }
        return result;
    }
}