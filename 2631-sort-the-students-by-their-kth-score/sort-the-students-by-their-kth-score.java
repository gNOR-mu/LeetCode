class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for (int i = 0; i < score.length; i++) {
            int index = i;
            for (int j = i + 1; j < score.length; j++) {
                if (score[j][k] > score[index][k])
                    index = j;
            }
            int[] temp = score[i];
            score[i] = score[index];
            score[index] = temp;
        }
        return score;
    }
}