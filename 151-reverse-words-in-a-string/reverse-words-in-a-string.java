class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder text = new StringBuilder();
        for (int i = words.length - 1; i > 0; i--) {
            text.append(words[i]);
            text.append(" ");
        }
        text.append(words[0]);
        return text.toString().trim();
    }
}