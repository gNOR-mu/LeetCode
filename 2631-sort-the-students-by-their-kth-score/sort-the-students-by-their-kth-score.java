class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
     for(int a=0;a<score.length-1;a++){
         for(int i=0;i<score.length-1;i++){
               if(score[i][k] < score[i+1][k]) swapNext(score,i);
        }
     }
        return score;
    }

    void swapNext(int[][] score, int i) {
        for (int j = 0; j < score[i].length; j++) {
            int tmp = score[i][j];
            score[i][j] = score[i + 1][j];
            score[i + 1][j] = tmp;
        }
    }
}