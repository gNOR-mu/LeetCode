class Solution {
    public boolean judgeCircle(String moves) {
        int v = 0;
        int h = 0;
        for (char c:moves.toCharArray()) {
            switch (c) {
                case 'U' -> v++;
                case 'D' -> v--;
                case 'L' -> h--;
                case 'R' -> h++;
            }
        }
        return v == 0 && h==0;
    }
}