class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> colZero = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean mustBeZero = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    mustBeZero = true;
                    colZero.add(j);
                }
            }
            if (mustBeZero) {
                matrix[i] = new int[matrix[i].length];
            }
        }
        for (int col : colZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}