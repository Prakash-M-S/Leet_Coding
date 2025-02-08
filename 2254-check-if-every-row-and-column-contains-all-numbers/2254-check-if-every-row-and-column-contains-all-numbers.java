class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            boolean[] rowCheck = new boolean[n];
            boolean[] colCheck = new boolean[n];

            for (int j = 0; j < n; j++) {
                int rowVal = matrix[i][j] - 1;
                int colVal = matrix[j][i] - 1;

                if (rowCheck[rowVal] || colCheck[colVal]) {
                    return false;
                }
                rowCheck[rowVal] = true;
                colCheck[colVal] = true;
            }
        }
        return true;
    }
}