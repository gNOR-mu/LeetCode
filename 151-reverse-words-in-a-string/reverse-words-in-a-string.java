class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder text = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            if (l != ' ') {
                word.append(l);
            } else if (!word.isEmpty()) {
                word.insert(0, " ");
                text.insert(0, word);
                word = new StringBuilder();
            }
        }
        text.insert(0, word);
        return text.toString();
    }
}