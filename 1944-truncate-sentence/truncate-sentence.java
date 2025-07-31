class Solution {
    public String truncateSentence(String s, int k) {
        int wordNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' ) {
                wordNum++;
                if (k == wordNum) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}