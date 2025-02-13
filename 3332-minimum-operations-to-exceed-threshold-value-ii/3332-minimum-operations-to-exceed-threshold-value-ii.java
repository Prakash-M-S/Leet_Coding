class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (long num : nums) pq.add(num);

        int ops = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            Long x = pq.poll();
            Long y = pq.poll();
            pq.add(x * 2 + y);
            ops++;
        }
        return ops;
    }
}