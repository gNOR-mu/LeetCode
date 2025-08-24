class Solution {
    public boolean judgeCircle(String moves) {
        int[] mov = new int[2];
        for (char c:moves.toCharArray()) {
            if(c=='U') mov[0]++;
            else if(c=='D') mov[0]--;
            else if(c=='L')mov[1]--;
            else if(c=='R')mov[1]++;
        }
        return mov[0] == 0 && mov[1]==0;
    }
}