class Solution {
    public boolean judgeCircle(String moves) {
        int[] mov = new int[2];
        for (char c:moves.toCharArray()) {
            switch (c) {
                case 'U' -> mov[0]++;
                case 'D' -> mov[0]--;
                case 'L' -> mov[1]--;
                case 'R' -> mov[1]++;
            }
        }
        return mov[0] == 0 && mov[1]==0;
    }
}