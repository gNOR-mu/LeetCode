class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> colWithZero = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean mustBeZero = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    mustBeZero = true;
                    colWithZero.add(j);
                }
            }
            if (mustBeZero) {
                System.arraycopy(new int[matrix[i].length], 0, matrix[i], 0, matrix[i].length);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (colWithZero.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}