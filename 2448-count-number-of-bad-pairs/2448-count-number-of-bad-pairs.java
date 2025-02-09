class Solution {
    public long countBadPairs(int[] nums) {
        long n = nums.length;
        long totalPairs = (n * (n - 1L)) / 2; 
        
        Map<Long, Long> freq = new HashMap<>();
        long goodPairs = 0L;
        
        for (int j = 0; j < n; j++) {
            long key = nums[j] - j;  
            goodPairs += freq.getOrDefault(key, 0L); 
            freq.put(key, freq.getOrDefault(key, 0L) + 1);
        }
        
        return totalPairs - goodPairs;
    }
}