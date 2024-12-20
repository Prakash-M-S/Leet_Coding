class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0, j = 0, bottom = n - 1, right = m - 1;

        while (i <= bottom && j <= right) {
            for (int col = j; col <= right; col++) {
                l.add(matrix[i][col]);
            }
            i++;

            for (int row = i; row <= bottom; row++) {
                l.add(matrix[row][right]);
            }
            right--;

            if (i <= bottom) {
                for (int col = right; col >= j; col--) {
                    l.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if (j <= right) {
                for (int row = bottom; row >= i; row--) {
                    l.add(matrix[row][j]);
                }
                j++;
            }
        }
        return l;
    }
}