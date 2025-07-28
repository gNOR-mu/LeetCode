class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            int column = 0;
            for (int j = image[0].length - 1; j >= 0; j--) {
                res[i][column++] = image[i][j]^1;
            }
        }
        return res;
    }
}