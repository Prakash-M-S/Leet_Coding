class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        for (int x = 0; x < n; x++) {
            boolean is_rotation = true;
            for (int i = 0; i < n; i++) {
                if (sorted[i] != nums[(i + x) % n]) {
                    is_rotation = false;
                    break;
                }
            }
            if (is_rotation)
                return true;
        }
        return false;

    }
}