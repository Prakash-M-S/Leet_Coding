class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int last = 0;

        for (int pos : left) {
            last = Math.max(last, pos);
        }

        for (int pos : right) {
            last = Math.max(last, n - pos);
        }

        return last;
    }
}