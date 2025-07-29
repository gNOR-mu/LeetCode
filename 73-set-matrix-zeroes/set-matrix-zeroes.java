class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowWithZero = new HashSet<>();
        Set<Integer> colWithZero = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowWithZero.add(i);
                    colWithZero.add(j);
                }
            }
        }
        for (int e : rowWithZero) {
            System.arraycopy(new int[matrix[e].length], 0, matrix[e], 0, matrix[e].length);
        }
        for (int e : colWithZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][e] = 0;
            }
        }
    }
}