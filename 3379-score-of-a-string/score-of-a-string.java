class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int l = s.length();
        for (int i = 1; i < l; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return score;
    }
}