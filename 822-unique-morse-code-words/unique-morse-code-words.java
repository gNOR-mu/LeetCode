class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
                "-..-", "-.--", "--.." };

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(morse[c - 'a']);
            }
            uniqueWords.add(sb.toString());
        }
        return uniqueWords.size();
    }
}