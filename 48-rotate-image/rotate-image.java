class Solution {
    public void rotate(int[][] matrix) {
        int l = matrix.length;
        for (int i = 0; i < l / 2; i++) {
            for (int j = i; j < l - 1 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[l - 1 - j][i];
                matrix[l - 1 - j][i] = matrix[l - 1 - i][l - 1 - j];
                matrix[l - 1 - i][l - 1 - j] = matrix[j][l - 1 - i];
                matrix[j][l - 1 - i] = temp;
            }
        }
    }
}